package Excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example3 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	FileInputStream file=new FileInputStream("F:\\Software_testing\\Excel Worksheet.xlsx");
	
	boolean data=WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(3).getBooleanCellValue();    
	System.out.println(data);
}
}