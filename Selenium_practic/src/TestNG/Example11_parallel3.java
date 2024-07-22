package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example11_parallel3 
{
	@Test
	public void openFacebookApp() throws InterruptedException
	{
		Reporter.log("Open Facebook App");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		driver.close();
	}
	@Test
	public void TC3()
	{
		Reporter.log("running TC3",true);
	
	}

}
