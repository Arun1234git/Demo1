 package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements_method2 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String text=driver.findElement(By.xpath("///input[@name='Forgotten password?']")).getText();
	System.out.println(text);
	
	System.out.println("***************");
	Thread.sleep(3000);

	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("xyz");
	Thread.sleep(3000);
	String info=driver.findElement(By.xpath("//input[@name='email']")).getAttribute("value");
	System.out.println(info);
	
}	

}
  