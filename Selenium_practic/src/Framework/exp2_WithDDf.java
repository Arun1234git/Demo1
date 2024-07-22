package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exp2_WithDDf 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("F:\\Software_testing\\Excel Worksheet.xlsx");
		
		Sheet sh=WorkbookFactory.create(file).getSheet("DDF");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		String Username=sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(Username);
		Thread.sleep(2000);
		
		String password=sh.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(2000);
		
		String actlogotext=driver.findElement(By.xpath("//div[text()='Swag Labs']")).getText();
		System.out.println(actlogotext);
		
		String explogotext=sh.getRow(0).getCell(2).getStringCellValue();
		if(actlogotext.equals(explogotext))
		{
			System.out.println("TC pass");
		}
		else
		{
			System.out.println("TC fail");
		}
		driver.findElement(By.xpath("//div[@class='bm-burger-button']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
		driver.quit();
	}
}


