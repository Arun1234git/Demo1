package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed 
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	boolean result =driver.findElement(By.xpath("//img[@class='fb_logo_8ilh img']")).isDisplayed();
	System.out.println(result);
	
	if(result)
	{
		System.out.println("logo found");
	}
	else
	{
		System.out.println("logo not found");
	}
}
}
