package Excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exp8_printAllDataInTable 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream file=new FileInputStream("F:\\Software_testing\\Excel Worksheet.xlsx");
		
		Sheet sh=WorkbookFactory.create(file).getSheet("DDF");
		
		int lastRowIndex=sh.getLastRowNum();
		
	for(int i=0;i<=lastRowIndex;i++)
	{
		int lastCellindex=sh.getRow(i).getLastCellNum()-1;
		for(int j=0;j<=lastCellindex;j++)
		{
			String value=sh.getRow(i).getCell(j).getStringCellValue();
			System.out.print(value+" ");
		}
		System.out.println();
}
}
}