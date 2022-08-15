package com.amrut1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import utility.SeleniumUtility;

public class ExcelReading extends SeleniumUtility {
	
	@Test(enabled=false)
	public void getSheetCount() throws IOException {
		//first find file location
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\testData\\AppData.xlsx");
		//*****Create an instance of respective workbook
		//class and provide file location to its constructor
		//find WorkBook
		//XSSFWorkbook workbook=new XSSFWorkbook(fis); this is fine but i want generic
		Workbook workbook=new XSSFWorkbook(fis);
		//get sheet info
		int sheetCount=workbook.getNumberOfSheets();
		System.out.println("the number of sheet are :"+sheetCount);
		//get all the sheet names
//		System.out.println("firstsheet name are:"+workbook.getSheetName(0));
//		System.out.println("secondsheet name are:"+workbook.getSheetName(1));
//		System.out.println("THirdsheet name are:"+workbook.getSheetName(2));
//		System.out.println("fourthsheet name are:"+workbook.getSheetName(3));
			for(int i=0;i<sheetCount;i++) 
			{
				System.out.println(workbook.getSheetName(i));
			}
		
	}
	@Test(enabled=false)
	public void getRowCount() throws IOException {
		//find file location
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\testData\\AppData.xlsx");
		//find workkbook
		Workbook workbook=new XSSFWorkbook(fis);
		//find sheetname
		Sheet sheet=workbook.getSheet("Sheet1");
		int sheetRow=((org.apache.poi.ss.usermodel.Sheet) sheet).getLastRowNum();//actual row count -1
		System.out.println("number of rows is sheet:"+sheetRow);
		Row row=sheet.getRow(1);
	}
	@Test(enabled=false)
	public void getCellCount() throws IOException
	{
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\testData\\AppData.xlsx");
		Workbook workbook=new XSSFWorkbook(fis);
		Sheet sheet=workbook.getSheet("Sheet1");
		int rowCount=sheet.getLastRowNum();
		Row row1=sheet.getRow(1);
		Row row0=sheet.getRow(0);
		int row0cellCount=row0.getLastCellNum();
		int cellcount=row1.getLastCellNum();
		System.out.println("the number of cell in second row:"+cellcount);
		System.out.println("the number of cell in first row:"+row0cellCount);
		
		//get cell
		//XSSFCell cell=row1.getCell(2);
		Cell cell=row1.getCell(2);
		String password=cell.getStringCellValue();
		System.out.println("the password is:"+password);
		for(int i=0;i<cellcount;i++)
		{
		System.out.println("get all the cell value is below:");
		System.out.println(row1.getCell(i).getStringCellValue());
		}
	}
	@Test
	public void loginActitime() throws IOException {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\testData\\AppData.xlsx");
		Workbook workbook=new XSSFWorkbook(fis);
		int sheetCount=workbook.getNumberOfSheets();
		System.out.println("the number of sheet are:"+sheetCount);
		Sheet sheet=workbook.getSheet("Sheet1");//get ref of sheet1
		Row row=sheet.getRow(1);
		Cell cell=row.getCell(0);
		String url=cell.getStringCellValue();
		System.out.println("the url is:"+url );
		Cell cell1=row.getCell(1);
		String username=cell1.getStringCellValue();
		Cell cell2=row.getCell(2);
		String password=cell2.getStringCellValue();
		System.out.println("username is:"+username+"    password is:"+password);
		SeleniumUtility.loginActititme(url, username, password);
		
		
		
	}
	

}
