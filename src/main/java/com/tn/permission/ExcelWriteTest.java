package com.tn.permission;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.joda.time.DateTime;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExcelWriteTest {

    String path = "D:\\file\\project\\idea\\permission\\";

    @Test
    public void testWrite03() throws Exception {
        //1.创建一个工作簿
        Workbook workbook = new HSSFWorkbook();
        //2.创建一个工作表
        Sheet sheet = workbook.createSheet("统计表");
        //3.创建一个行
        Row row1 = sheet.createRow(0);
        //4.创建一个单元格
        Cell cell11 = row1.createCell(0);
        cell11.setCellValue("今日新增观众");

        Cell cell12 = row1.createCell(1);
        cell12.setCellValue(666);

        //第二行
        Row row2 = sheet.createRow(1);
        Cell cell21 = row2.createCell(0);
        cell21.setCellValue("统计时间");

        Cell cell22 = row2.createCell(1);
        String time = new DateTime().toString("yyyy-MM-dd HH:mm:ss");
        cell22.setCellValue(time);

        //生成一张表（IO流）
        FileOutputStream fileOutputStream = new FileOutputStream(path + "统计表03.xls");
        workbook.write(fileOutputStream);
        fileOutputStream.close();

        System.out.println("统计表生成完毕！");

    }

    @Test
    public void testWrite07() throws Exception {
        //1.创建一个工作簿
        Workbook workbook = new XSSFWorkbook();
        //2.创建一个工作表
        Sheet sheet = workbook.createSheet("统计表");
        //3.创建一个行
        Row row1 = sheet.createRow(0);
        //4.创建一个单元格
        Cell cell11 = row1.createCell(0);
        cell11.setCellValue("今日新增观众");

        Cell cell12 = row1.createCell(1);
        cell12.setCellValue(666);

        //第二行
        Row row2 = sheet.createRow(1);
        Cell cell21 = row2.createCell(0);
        cell21.setCellValue("统计时间");

        Cell cell22 = row2.createCell(1);
        String time = new DateTime().toString("yyyy-MM-dd HH:mm:ss");
        cell22.setCellValue(time);

        //生成一张表（IO流）
        FileOutputStream fileOutputStream = new FileOutputStream(path + "统计表07.xlsx");
        workbook.write(fileOutputStream);
        fileOutputStream.close();

        System.out.println("统计表生成完毕！");

    }

    @Test
    public void testWrite03BigData() throws Exception {
        //时间
        long begin = System.currentTimeMillis();

        //创建一个簿
        Workbook workbook = new HSSFWorkbook();

        //创建表
        Sheet sheet = workbook.createSheet();

        //写入数据
        for (int rowNum = 0; rowNum < 65536; rowNum++) {
            Row row = sheet.createRow(rowNum);
            for (int cellNum = 0; cellNum < 10; cellNum++) {
                Cell cell = row.createCell(cellNum);
                cell.setCellValue(cellNum);
            }
        }

        System.out.println("over");
        FileOutputStream fileOutputStream = new FileOutputStream(path + "testWrite03BigData.xls");
        workbook.write(fileOutputStream);
        fileOutputStream.close();

        long end = System.currentTimeMillis();
        System.out.println((double) (end-begin)/1000);

    }

    @Test
    public void testWrite07BigData() throws Exception {
        //时间
        long begin = System.currentTimeMillis();

        //创建一个簿
        Workbook workbook = new XSSFWorkbook();

        //创建表
        Sheet sheet = workbook.createSheet();

        //写入数据
        for (int rowNum = 0; rowNum < 100000; rowNum++) {
            Row row = sheet.createRow(rowNum);
            for (int cellNum = 0; cellNum < 10; cellNum++) {
                Cell cell = row.createCell(cellNum);
                cell.setCellValue(cellNum);
            }
        }

        System.out.println("over");
        FileOutputStream fileOutputStream = new FileOutputStream(path + "testWrite07BigData.xlsx");
        workbook.write(fileOutputStream);
        fileOutputStream.close();

        long end = System.currentTimeMillis();
        System.out.println((double) (end-begin)/1000);

    }

    @Test
    public void testWrite07BigDataS() throws Exception {
        //时间
        long begin = System.currentTimeMillis();

        //创建一个簿
        Workbook workbook = new SXSSFWorkbook();

        //创建表
        Sheet sheet = workbook.createSheet();

        //写入数据
        for (int rowNum = 0; rowNum < 100000; rowNum++) {
            Row row = sheet.createRow(rowNum);
            for (int cellNum = 0; cellNum < 10; cellNum++) {
                Cell cell = row.createCell(cellNum);
                cell.setCellValue(cellNum);
            }
        }

        System.out.println("over");
        FileOutputStream fileOutputStream = new FileOutputStream(path + "testWrite07BigDataS.xlsx");
        workbook.write(fileOutputStream);
        fileOutputStream.close();
        //清除临时文件
        ((SXSSFWorkbook) workbook).dispose();
        long end = System.currentTimeMillis();
        System.out.println((double) (end-begin)/1000);

    }

}
