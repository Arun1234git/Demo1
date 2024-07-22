package Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exp6_printAllDataInRow 
{
public static void main(String[] args) throws IOException 
{
	FileInputStream file=new FileInputStream("F:\\Software_testing\\Excel Worksheet.xlsx");
	
	Sheet sh=WorkbookFactory.create(file).getSheet("Sheet2");
	int lastcellIndex=sh.getRow(0).getLastCellNum()-1;
	
	for(int i=0;i<=lastcellIndex;i++)
		{
	String value=sh.getRow(0).getCell(i).getStringCellValue();
	System.out.print(value+" ");
		}
}
}
