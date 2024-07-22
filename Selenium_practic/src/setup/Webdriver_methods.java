package setup;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_methods
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	
	driver.get("https:www.facebook.com/");		//to open perticular webpage/website
	Thread.sleep(5000);		
	
	//driver.close();
	
	//driver.quit();
	
	System.out.println(driver.getTitle());
	//System.out.println(driver.getCurrentUrl());
	
	
}
}
