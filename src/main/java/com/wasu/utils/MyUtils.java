package com.wasu.utils;

import com.wasu.model.Assert;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by kale on 2017/10/25.
 */
public class MyUtils {
    private static Logger logger = Logger.getLogger(MyUtils.class.getName());


    /**
     * 读取excel
     * @return
     */
    public static List<Assert> readExcel() {
        List<Assert> result = new ArrayList<>();
        boolean isE2007 = false;
        String fileName="D:\\work\\assert.xlsx";
//        String fileName = "/Users/kale/test/assert.xlsx";
        if (fileName.endsWith(".xlsx"))
            isE2007 = true;
        try {
            InputStream input = new FileInputStream(fileName);
            Workbook wb = null;
            if (isE2007)
                wb = new XSSFWorkbook(input);
            else
                wb = new HSSFWorkbook(input);
            Sheet sheet = wb.getSheetAt(1);
            int coloumNum = sheet.getRow(0).getPhysicalNumberOfCells();
            int rowNum = sheet.getLastRowNum();
            for (int i = 1; i < 100; i++) {
//                Row row = sheet.getRow(i);
//                Assert a1 = new Assert();
//                a1.setId(new BigDecimal(row.getCell(0).getNumericCellValue()));
//                a1.setAssetcode(row.getCell(1).getStringCellValue());
//                a1.setAssetsortname(row.getCell(2).getStringCellValue());
//                if (row.getCell(3) != null)
//                    a1.setName(row.getCell(3).getStringCellValue());
//                if (row.getCell(4) != null)
//                    a1.setNorms(row.getCell(4).getStringCellValue());
//                if (row.getCell(6) != null)
//                    a1.setNumbers((int) row.getCell(6).getNumericCellValue());
//                if (row.getCell(7) != null)
//                    a1.setPrice(new BigDecimal(row.getCell(7).getNumericCellValue()));
//                if (row.getCell(9) != null)
//                    a1.setState((short) row.getCell(8).getNumericCellValue());
//                if (row.getCell(9) != null)
//                    a1.setDeptname(row.getCell(9).getStringCellValue());
//                if (row.getCell(10) != null)
//                    a1.setPlace(row.getCell(10).getStringCellValue());
//                if (row.getCell(11) != null)
//                    a1.setManufacturer(row.getCell(11).getStringCellValue());
//                    a1.setBuydate(row.getCell(12).getDateCellValue());
//                if (row.getCell(13) != null){
//                    logger.info("非空");
//                    a1.setProjectid(row.getCell(13).getNumericCellValue()+"");
//                }
//                if (row.getCell(14) != null)
//                    a1.setProjectname(row.getCell(14).getStringCellValue());
//                if (row.getCell(15) != null)
//                    a1.setValid((short) row.getCell(15).getNumericCellValue());
//                if (row.getCell(16) != null)
//                    a1.setRemark(row.getCell(16).getStringCellValue());
//                if (row.getCell(17) != null)
//                    a1.setDetailedlocation(row.getCell(17).getStringCellValue());
//                if (row.getCell(18) != null)
//                    a1.setGuarantee((short) row.getCell(18).getNumericCellValue());
//                if (row.getCell(19) != null)
//                    a1.setLifeperiods((short) row.getCell(19).getNumericCellValue());
//                if (row.getCell(20) != null)
//                    a1.setPeriodsused((short) row.getCell(20).getNumericCellValue());
//                result.add(a1);
//                logger.info("添加元素"+a1.getId()+"----"+a1.getAssetcode());
            }

        } catch (Exception e) {
            logger.info("出错了");
            e.printStackTrace();
        }
        return result;
    }

    public static  void main(String[] args){
        String dd="30.15557020399305";
        System.out.println(Long.parseLong(dd));
        test1();
    }

    public static void test1(){
        MyThread t1=new MyThread();
        t1.setName("t1");
        MyThread t2=new MyThread();
        t2.setName("t2");
        t1.start();
        t2.start();
    }


    public static void MyTest(){
        try(InputStream is=new FileInputStream("lll")){

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void MyGet(String url){
        try {
            StringBuffer buffer = new StringBuffer();

//            String url = "http://localhost:8080/istock/login?u=name&p=pass";
            System.out.println("访问地址:" + url);

            //发送get请求
            URL serverUrl = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) serverUrl.openConnection();
            conn.setRequestMethod("GET");
            //必须设置false，否则会自动redirect到重定向后的地址
            conn.setInstanceFollowRedirects(false);
            conn.addRequestProperty("Accept-Charset", "UTF-8;");
            conn.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows; U; Windows NT 5.1; zh-CN; rv:1.9.2.8) Firefox/3.6.8");
            conn.addRequestProperty("Referer", "http://matols.com/");
            conn.connect();

            //判定是否会进行302重定向
            if (conn.getResponseCode() == 302) {
                //如果会重定向，保存302重定向地址，以及Cookies,然后重新发送请求(模拟请求)
                String location = conn.getHeaderField("Location");
                String cookies = conn.getHeaderField("Set-Cookie");

                serverUrl = new URL(location);
                conn = (HttpURLConnection) serverUrl.openConnection();
                conn.setRequestMethod("GET");
                conn.setRequestProperty("Cookie", cookies);
                conn.addRequestProperty("Accept-Charset", "UTF-8;");
                conn.addRequestProperty("User-Agent","Mozilla/5.0 (Windows; U; Windows NT 5.1; zh-CN; rv:1.9.2.8) Firefox/3.6.8");
                conn.addRequestProperty("Referer", "http://matols.com/");
                conn.connect();
                System.out.println("跳转地址:" + location);
            }

            //将返回的输入流转换成字符串
            InputStream inputStream = conn.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream,"utf-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String str = null;
            while ((str = bufferedReader.readLine()) != null) {
                buffer.append(str);
            }
            bufferedReader.close();
            inputStreamReader.close();
            // 释放资源
            inputStream.close();
            inputStream = null;

            System.out.println(buffer.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
