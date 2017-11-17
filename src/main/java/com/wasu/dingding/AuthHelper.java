package com.wasu.dingding;

import com.alibaba.fastjson.JSONObject;
import com.dingtalk.oapi.lib.aes.DingTalkJsApiSingnature;
import com.dingtalk.open.client.ServiceFactory;
import com.dingtalk.open.client.api.model.corp.JsapiTicket;
import com.dingtalk.open.client.api.service.corp.CorpConnectionService;
import com.dingtalk.open.client.api.service.corp.JsapiService;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.wasu.utils.HttpHelper;

import javax.servlet.http.HttpServletRequest;
import java.net.URLDecoder;
import java.util.Formatter;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * AccessToken和jsticket的获取封装
 */
public class AuthHelper {

    private static Cache<String, String> cache_token;

    private static Cache<String, String> cache_ticket;

    /*
     * 在此方法中，为了避免频繁获取access_token，
     * 在距离上一次获取access_token时间在两个小时之内的情况，
     * 将直接从持久化存储中读取access_token
     *
     * 因为access_token和jsapi_ticket的过期时间都是7200秒
     * 所以在获取access_token的同时也去获取了jsapi_ticket
     * 注：jsapi_ticket是在前端页面JSAPI做权限验证配置的时候需要使用的
     * 具体信息请查看开发者文档--权限验证配置
     */
    public static String getAccessToken() throws OApiException {
        return getTokenCache();
    }

    /**
     * 获取JSTicket, 用于js的签名计算
     * 正常的情况下，jsapi_ticket的有效期为7200秒，所以开发者需要在某个地方设计一个定时器，定期去更新jsapi_ticket
     */
    public static String getJsapiTicket(String accessToken) throws OApiException {
        return getTicketCache(accessToken);
    }

    public static String sign(String ticket, String nonceStr, long timeStamp, String url) throws OApiException {
        try {
            return DingTalkJsApiSingnature.getJsApiSingnature(url, nonceStr, timeStamp, ticket);
        } catch (Exception ex) {
            throw new OApiException(0, ex.getMessage());
        }
    }

    private static String bytesToHex(byte[] hash){
        Formatter formatter=new Formatter();
        for(byte b:hash ){
            formatter.format("%02x",b);
        }
        String result=formatter.toString();
        formatter.close();
        return  result;
    }


    /**
     * 计算当前请求的jsapi的签名数据<br/>
     * <p>
     * 如果签名数据是通过ajax异步请求的话，签名计算中的url必须是给用户展示页面的url
     *
     * @param request
     * @return
     */
    public static String getConfig(HttpServletRequest request) {
        String urlString = request.getRequestURL().toString();
        String queryString = request.getQueryString();

        String queryStringEncode = null;
        String url;
        if (queryString != null) {
            queryStringEncode = URLDecoder.decode(queryString);
            url = urlString + "?" + queryStringEncode;
        } else {
            url = urlString;
        }

        String nonceStr = "abcdefg";
        long timeStamp = System.currentTimeMillis() / 1000;
        String signedUrl = url;
//        String signedUrl = "http://125.210.115.11:8082/treasure/";
        String accessToken = null;
        String ticket = null;
        String signature = null;
        String agentid = null;

        try {
            accessToken= AuthHelper.getAccessToken();
            ticket = AuthHelper.getJsapiTicket(accessToken);
            System.out.println("signedUrl:"+signedUrl);
            signature = AuthHelper.sign(ticket, nonceStr, timeStamp, signedUrl);
            agentid = Env.AGENT_ID;

        } catch (OApiException e) {
            e.printStackTrace();
        }
        String configValue = "{jsticket:'" + ticket + "',signature:'" + signature + "',nonceStr:'" + nonceStr + "',timeStamp:'"
                + timeStamp + "',corpId:'" + Env.CORP_ID + "',agentid:'" + agentid + "'}";
        System.out.println(configValue);
        return configValue;
    }


    public static String getSsoToken() throws OApiException {
        String url = "https://oapi.dingtalk.com/sso/gettoken?corpid=" + Env.CORP_ID + "&corpsecret=" + Env.SSO_Secret;
        JSONObject response = HttpHelper.httpGet(url);
        String ssoToken;
        if (response.containsKey("access_token")) {
            ssoToken = response.getString("access_token");
        } else {
            throw new OApiException("Sso_token");
        }
        return ssoToken;

    }

    public static String getTokenCache() {
        final String key = "access_token";
        if (cache_token == null) {
            cache_token = CacheBuilder.newBuilder().maximumSize(1000).refreshAfterWrite(1, TimeUnit.HOURS)
                    .expireAfterAccess(1, TimeUnit.HOURS).build(new CacheLoader<String, String>() {
                        @Override
                        public String load(String s) throws Exception {
                            return null;
                        }
                    });
        }

        try {
            String result = (String) cache_token.get(key,
                    new Callable<String>() {
                        @Override
                        public String call() throws Exception {
//                            String accToken = "123456";
                            String accToken = "";
                            try {
                                ServiceFactory serviceFactory = ServiceFactory.getInstance();
                                CorpConnectionService corpConnectionService = serviceFactory.getOpenService(CorpConnectionService.class);
                                accToken = corpConnectionService.getCorpToken(Env.CORP_ID, Env.CORP_SECRET);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            return accToken;
                            // return chanelTeamManager.getMenu(query);
                        }
                    });

            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getTicketCache(String accessToken) {
        final String key = "ticket";
        if (cache_ticket == null) {
            cache_ticket = CacheBuilder.newBuilder().maximumSize(1000).refreshAfterWrite(1, TimeUnit.HOURS)
                    .expireAfterAccess(1, TimeUnit.HOURS).build(new CacheLoader<String, String>() {
                        @Override
                        public String load(String s) throws Exception {
                            return null;
                        }
                    });
        }

        try {
            String result = (String) cache_ticket.get(key,
                    new Callable<String>() {
                        @Override
                        public String call() throws Exception {
//                            String jsTicket = "654321";
                            String jsTicket = "";
                            ServiceFactory serviceFactory;
                            try {
                                serviceFactory = ServiceFactory.getInstance();
                                JsapiService jsapiService = serviceFactory.getOpenService(JsapiService.class);

                                JsapiTicket JsapiTicket = jsapiService.getJsapiTicket(accessToken, "jsapi");
                                jsTicket = JsapiTicket.getTicket();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            return jsTicket;
                        }
                    });

            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
