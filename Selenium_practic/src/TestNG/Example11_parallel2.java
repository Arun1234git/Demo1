package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example11_parallel2 
{
	@Test
	public void openFacebookApp() throws InterruptedException
	{
		Reporter.log("Open Facebook App");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.close();
	}
	@Test
	public void TC2()
	{
		Reporter.log("running TC2",true);
	
	}

}
