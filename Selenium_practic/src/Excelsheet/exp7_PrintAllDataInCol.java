package Excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exp7_PrintAllDataInCol 
{
	
	public static void main(String[] args) throws IOException 
	{
		FileInputStream file=new FileInputStream("F:\\Software_testing\\Excel Worksheet.xlsx");
		
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet2");
		int lastRowIndex=sh.getLastRowNum();
		
	for(int i=0;i<=lastRowIndex;i++)
	{
		String value=sh.getRow(i).getCell(3).getStringCellValue();
		System.out.println(value);
	}
}
}