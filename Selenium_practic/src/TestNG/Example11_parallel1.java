package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example11_parallel1 
{
	@Test
	public void openFacebookApp() throws InterruptedException
	{
		Reporter.log("Open Facebook App");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.close();
	}
	@Test
	public void TC1()
	{
		Reporter.log("running TC1",true);
	
	}
	}
