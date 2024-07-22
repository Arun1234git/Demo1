package Screenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class exp1_captureScreenshotofWebpage 
{
	public static void main(String[] args) throws IOException 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("E:\\SW  testing\\Screenshots\\Demo1.png");
		FileHandler.copy(source, dest);
		
		//File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	}
}						