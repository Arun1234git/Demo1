package setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_attribute 
{
	
	
		public static void main(String[] args) 
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
			
			 
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd");
			driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("amruta123");
			driver.findElement(By.xpath("//button[@name='login']")).click();
			driver.findElement(By.xpath("//button[@name='login']")).click();
			
		

			
		} 
}
