package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick 
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	
	WebElement element =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	Actions act=new Actions(driver);
	
	//approach 1
	//act.moveToElement(element).perform();;
	//act.doubleClick().perform();
	
	//approach 2
	act.moveToElement(element).doubleClick().perform();
	
	//approach 3
	
	//act.doubleClick(element).perform();
		
}
}
