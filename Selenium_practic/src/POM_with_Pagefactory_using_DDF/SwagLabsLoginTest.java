package POM_with_Pagefactory_using_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsLoginTest 
{
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
{
	FileInputStream file=new FileInputStream("F:\\Software_testing\\Excel Worksheet.xlsx");
	Sheet sh=WorkbookFactory.create(file).getSheet("DDF");
	
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.manage().window().maximize();
	
	SwagLabsLoginPage login= new SwagLabsLoginPage(driver);
	login.inpSwagLabsLoginPageUsername(sh.getRow(0).getCell(0).getStringCellValue());
	Thread.sleep(1000);
	login.inpSwagLabsLoginPagePassword(sh.getRow(0).getCell(1).getStringCellValue());
	Thread.sleep(1000);
	
	login.clickSwagLabsLoginPageBtn();
	
	
	SwagLabsHomePage home=new SwagLabsHomePage(driver);
	
	home.verifySwagLabsHomePageLogologo(sh.getRow(0).getCell(2).getStringCellValue());
	Thread.sleep(1000);
	home.clickSwagLabsHomePageOpenMenu();
	Thread.sleep(1000);
	
	SwagLabsOpenMenuPage menu=new SwagLabsOpenMenuPage(driver);
	menu.ClickSwagLabsOpenMenuPageLogout();
	
	Thread.sleep(1000);
	driver.quit();
	
}
}
