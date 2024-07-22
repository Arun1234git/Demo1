package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_contains_text
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//click on forgotten password link
		
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
	}
}
