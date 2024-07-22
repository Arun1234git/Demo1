package Customised_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class select3rdOption 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nobroker.in/");
		
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.xpath("(//div[@class='css-1wyOon6nb-select_indicators'])[2]"));
		
		Actions act=new Actions(driver);
		act.click(element);
		
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		
		act.sendKeys(Keys.ENTER).perform();
		

	}
}
