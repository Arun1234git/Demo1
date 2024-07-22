package Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exp5_getColmSizeinRow 
{
public static void main(String[] args) throws IOException 
{
		FileInputStream file=new FileInputStream("F:\\Software_testing\\Excel Worksheet.xlsx");
		
		int colSize=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum(); 
		System.out.println(colSize);
		
		
}
}
