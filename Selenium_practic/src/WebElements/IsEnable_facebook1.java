package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable_facebook1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		boolean result=driver.findElement(By.xpath("//button[text()='Log in']")).isEnabled();
		System.out.println(result);
		
		if(result)
		{
			System.out.println("element is enable");
		}
		else
		{
			System.out.println("element is not enable");
		}
		
}
}
