package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class exp2_captureScreenshotofSpecificelementIn_Webpage 
{


public static void main(String[] args) throws IOException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	File source=driver.findElement(By.xpath("//img[@class='fb_logo_8ilh img']")).getScreenshotAs(OutputType.FILE);
	//WebElement logo=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
	//File src=logo.getScreenshotAs(OutputType.FILE);
	
	File dest=new File("E:\\SW  testing\\Screenshots\\demo2");
	FileHandler.copy(source, dest);
	
	//File source=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).getScreenshotAs(OutputType.FILE);
	
	

}
}
