package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollUpDown2 

{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	Thread.sleep(2000);
	
	Actions act=new Actions(driver);
	act.scrollByAmount(0, 300).perform();
	
	Thread.sleep(2000);
	
	act.scrollByAmount(0, -100).perform();
	
	//scroll right
	act.scrollByAmount(200, 0).perform();
	
	act.scrollByAmount(-50, 0).perform();
	
	
}
}
