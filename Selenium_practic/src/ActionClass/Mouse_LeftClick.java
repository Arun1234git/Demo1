package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_LeftClick 
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.eBay.com/");
	
	WebElement sell =driver.findElement(By.xpath("//a[text()=' sell']"));
	Actions act=new Actions(driver);
	
	//approach 1
	act.moveToElement(sell).perform();;
	act.click().perform();
	
	//approach 2
	act.moveToElement(sell).click().perform();
	
	//approach 3
	
	act.click(sell).perform();
		
}
}
