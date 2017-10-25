package com.wasu.utils;

import com.wasu.model.Assert;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kale on 2017/10/25.
 */
public class MyUtils {
    public static void main(String[] args){

    }

    public static List<Assert> readExcel(){
        List<Assert> result=new ArrayList<>();
        boolean isE2007=false;
        String fileName="D:\\work\\assert.xlsx";
        if(fileName.endsWith(".xlsx"))
            isE2007=true;
        try {
            InputStream input=new FileInputStream(fileName);
            Workbook wb=null;
            if(isE2007)
                wb=new XSSFWorkbook(input);
            else
                wb=new HSSFWorkbook(input);
            Sheet sheet=wb.getSheetAt(1);
            int coloumNum=sheet.getRow(0).getPhysicalNumberOfCells();
            int rowNum=sheet.getLastRowNum();
            for(int i=1;i<rowNum;i++){
                Row row=sheet.getRow(i);
                Assert a1=new Assert();
                a1.setId(row.getCell(0).getStringCellValue());
                a1.setAssetcode(row.getCell(1).getStringCellValue());
                result.add(a1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
