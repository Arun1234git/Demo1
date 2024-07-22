package Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.sun.rowset.internal.Row;

public class Example1 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	FileInputStream file=new FileInputStream("F:\\Software_testing\\Excel Worksheet.xlsx");
	
	String data=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();    
	System.out.println(data);
	
	//WorkbookFactory.create(file);
	
	
	//Workbook book=WorkbookFactory.create(file);
	
	//Sheet sh=book.getSheet("Sheet1");
	
	//Row rw=sh.getrow(0)
	
	//Cell cl=rw.cell(0);

	//String data=cl.getStringCellValue();
	//System.out.println(data);
	
	
	}
}
