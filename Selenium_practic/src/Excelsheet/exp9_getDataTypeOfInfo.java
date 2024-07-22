package Excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.EncryptedDocumentException;

public class exp9_getDataTypeOfInfo 
{
public static void main(String[] args) throws IOException 
{
	FileInputStream file=new FileInputStream("F:\\Software_testing\\Excel Worksheet.xlsx");
	
	Sheet sh=WorkbookFactory.create(file).getSheet("Sheet3");
	
	Cell cellinfo=sh.getRow(1).getCell(2);
	CellType s1=cellinfo.getCellType();
	System.out.println(s1);
	
	
}
}
