package Autosuggesion;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 
{
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	
	driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
	
	Thread.sleep(1000);
	
	 List<WebElement> alloptions=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li//div[@class='wM6W7d']"));
	 
	 String expresult="redmi 12";
	 
	 for(WebElement s1:alloptions)
	 {
		 String actresult=s1.getText();
		 System.out.println(actresult);
		 if(actresult.equals(expresult))
		 {
			 
			 s1.click(); 
			 break;
		 }
	 }
	
	
	
	
	}
}
