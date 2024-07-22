package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollUpDown1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
		WebElement signup=driver.findElement(By.xpath("//a[text()='Sign Up']"));
		
		Actions act=new Actions(driver);
		act.scrollToElement(signup).perform();
		
		
		
	}

}
