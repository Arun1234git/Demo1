package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Exp1_HandlingDropDown 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.ebay.com");
	
	//step1
	WebElement eBay=driver.findElement(By.xpath("//a[text()='My eBay']"));
	
	//step2
	Actions act= new Actions(driver);
	
	//step3
	
	act.moveToElement(eBay).perform();
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//a[text()='WatchList']")).click();
	
	

	
	
	
}
}
