package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 
{
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();	
	driver.get("https://www.amazon.in/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics");
	
	Thread.sleep(2000);
	
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	//xpath for prime drop down and click on it
	driver.findElement(By.xpath("//span[text()='Prime']")).click();
	}
	
}


 



//driver.navigate().to("https://www.amazon.in/s?k=microwave+and+refrigerator&crid=1TBMM7TQQSSRS&sprefix=microwave+and+refrigerator%2Caps%2C398&ref=nb_sb_noss_2");
//driver.findElement(By.xpath("//img[@class='s-image']")).click();
