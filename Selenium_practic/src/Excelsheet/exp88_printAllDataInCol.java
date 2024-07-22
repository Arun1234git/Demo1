package Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exp88_printAllDataInCol 
{
	public static void main(String[] args) throws IOException,EncryptedDocumentException
	{
		FileInputStream file=new FileInputStream("\\F:Software_testing\\Excel Worksheet.xlsx");
		
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet4");
		
		int lastRowIndex=sh.getLastRowNum();
		for(int i=0;i<=lastRowIndex;i++)
		{
			int lastcellIndex=sh.getRow(i).getLastCellNum()-1;
			for(int j=0;j<=lastcellIndex;j++)
			{
				Cell s1=sh.getRow(i).getCell(j);
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
			System.out.println();
	
	}
}
}