package Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exp66_printAllDatainRow 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream file=new FileInputStream("\\F:Software_testing\\Excel Worksheet.xlsx");
			
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet4");
		int lastCellIndex=sh.getRow(0).getLastCellNum()-1;
			
			for(int i=0;i<=lastCellIndex;i++)
			{
				Cell s1=sh.getRow(0).getCell(i);
				CellType s2=s1.getCellType();
				
				if(s2==CellType.STRING) 
				{
					System.out.print(s1.getStringCellValue()+" ");
				}
				else if(s2==CellType.NUMERIC)
				{
					System.out.print(s1.getNumericCellValue()+" ");
				}
				else if(s2==CellType.BOOLEAN)
				{
					System.out.print(s1.getBooleanCellValue()+" ");
				}
			}
			
	}
}
