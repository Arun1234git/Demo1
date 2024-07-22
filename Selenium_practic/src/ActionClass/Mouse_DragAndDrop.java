package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_DragAndDrop 
{
	public static void main(String[] args) {
		
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	
	WebElement srcEle=driver.findElement(By.xpath("(//li[@class='block13ui-draggable'])[1]"));
	WebElement destEle=driver.findElement(By.xpath("(//div[@class='ui-widget-content'][3]"));
	
	Actions act=new Actions(driver);
	act.dragAndDrop(srcEle, destEle).perform();
	
	//approach 2
	act.moveToElement(srcEle).clickAndHold().moveToElement(destEle).release().perform();
	
}
}

