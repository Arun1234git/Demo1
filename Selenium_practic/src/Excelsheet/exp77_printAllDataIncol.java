package Excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exp77_printAllDataIncol 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream file=new FileInputStream("\\F:Software_testing\\Excel Worksheet.xlsx");
			
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet4");
		int lastRowIndex=sh.getLastRowNum();
			
			for(int i=0;i<=lastRowIndex;i++)
			{
				Cell s1=sh.getRow(i).getCell(0);
				CellType s2=s1.getCellType();
				
				if(s2==CellType.STRING) 
				{
					System.out.println(s1.getStringCellValue()+" ");
				}
				else if(s2==CellType.NUMERIC)
				{
					System.out.println(s1.getNumericCellValue()+" ");
				}
				else if(s2==CellType.BOOLEAN)
				{
					System.out.println(s1.getBooleanCellValue()+" ");
				}
			}
			
	}

}



