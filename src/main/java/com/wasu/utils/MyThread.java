package com.wasu.utils;

/**
 * Created by kale on 2017/11/13.
 */
public class MyThread extends Thread {

    private int flag=100;
    private String url="http://125.210.141.31/v2/log?projectName=gshd2.2&pagecode=index&cName=%E6%A0%8F%E7%9B%AE%5E%E7%94%98%E8%82%83%E9%A6%96%E9%A1%B53.1%E7%89%88%E6%9C%AC&rName=&cp=http%3A%2F%2Fwww.utc.gscatv.cn%2Ffolder%2Fiptv_gansu%2FRDIPTV_GS_IPS_08151027732885130%2F47783.page&rp=http%3A%2F%2F125.210.141.30%2Fmedia3_new1.jsp&tvcode=123&rt=7758258";

    @Override
    public void run() {
        while((flag-- >0)){
            try {
                Thread.sleep(100);
//                HttpHelper.httpPost(url,null);
                MyUtils.MyGet(url);
                System.out.println(this.getName()+"第"+flag+"次");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
