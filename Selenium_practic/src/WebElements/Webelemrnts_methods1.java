package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelemrnts_methods1 
{

	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();	
	driver.get("https://www.facebook.com/");
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[text()='Forgotten password?']")).clear();
	
	driver.findElement(By.xpath("//input[@name='email']")).click();
	
	
	
	
	
	
	}
}
