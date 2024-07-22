package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_contains_attribute 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");	
		driver.findElement(By.xpath("//input[contains(@name,'email']")).sendKeys("abcd");
		
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Pass']")).sendKeys("  gfdgfdg123");
		driver.findElement(By.xpath("//input[contains(@name,'Pass']")).sendKeys("gfdg123");
	}
}
