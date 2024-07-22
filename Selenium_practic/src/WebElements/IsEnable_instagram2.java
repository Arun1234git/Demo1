package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable_instagram2 
{
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	
	boolean result=driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
	System.out.println(result);

	if(result)
	{
		System.out.println("element is enable");
	}
	else
	{
		System.out.println("element is disable");
	}
	
}
}
