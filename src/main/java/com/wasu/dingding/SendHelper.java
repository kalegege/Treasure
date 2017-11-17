package com.wasu.dingding;

import com.alibaba.fastjson.JSONObject;

import com.wasu.utils.HttpHelper;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.SimpleFormatter;

public class SendHelper {
    /**
     *
     * @param userid
     * @param code
     * @param msgtype
     * @return
     */
    public static JSONObject send(String userid,String code,MSGTYPE msgtype){
        Map<String,Object> data=new HashMap<>();
        String url= null;
        JSONObject result=new JSONObject();
        try {
            url = "https://oapi.dingtalk.com/message/sendByCode?access_token="+ AuthHelper.getAccessToken();
            data.put("agentid",Env.AGENT_ID);
            data.put("code",code);
            data.put("touser",userid);
            switch(msgtype){
                case TEXT:
                    data.put("msgtype","text");
                    Map<String,String> m=new HashMap<>();
                    m.put("content","你有新的盘点任务！"+new Date());
                    data.put("text",m);
                    break;
                case LINK:
                    Map<String,String> link=new HashMap<>();
                    SimpleDateFormat formatter=new SimpleDateFormat("HH:mm");
                    link.put("messageUrl","http://125.210.115.11:8082/treasure");
                    link.put("title","盘点系统提醒");
                    link.put("text","你有新的盘点任务！"+formatter.format(new Date()));
                    link.put("picUrl","@lALOACZwe2Rk");
                    data.put("link",link);
                    data.put("msgtype","link");
                    break;
            }
            result= HttpHelper.httpPost(url,data);
            System.out.println(new Date()+"发送结果为："+result);
        } catch (OApiException e) {
            e.printStackTrace();
        }
        return result;
    }
//    public static void send(List<String> ids){
//        DingTalkClient client = new DefaultDingTalkClient("https://eco.taobao.com/router/rest");
//        CorpMessageCorpconversationAsyncsendRequest req = new CorpMessageCorpconversationAsyncsendRequest();
//        req.setMsgtype("oa");
//        req.setAgentId(1234L);
//        req.setUseridList(ids.toString());
//        req.setToAllUser(false);
//        req.setMsgcontentString("{\"message_url\": \"http://dingtalk.com\",\"head\": {\"bgcolor\": \"FFBBBBBB\",\"text\": \"头部标题\"},\"body\": {\"title\": \"正文标题\",\"form\": [{\"key\": \"姓名:\",\"value\": \"张三\"},{\"key\": \"爱好:\",\"value\": \"打球、听音乐\"}],\"rich\": {\"num\": \"15.6\",\"unit\": \"元\"},\"content\": \"大段文本大段文本大段文本大段文本大段文本大段文本大段文本大段文本大段文本大段文本大段文本大段文本\",\"image\": \"@lADOADmaWMzazQKA\",\"file_count\": \"3\",\"author\": \"李四 \"}}");
//        CorpMessageCorpconversationAsyncsendResponse rsp = client.execute(req, access_token);
//        System.out.println(rsp.getBody());
//    }
}
