package Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exp4_getRowSize 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("\\F:Software_testing\\Excel Worksheet.xlsx");
		
		int rowSize =WorkbookFactory.create(file).getSheet("Sheet").getLastRowNum()+1;
		System.out.println(rowSize);
	}
}
