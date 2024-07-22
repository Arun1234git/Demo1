package HandlingOfMultipleElement;

import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.java.accessibility.util.internal.ListTranslator;

public class selectMultipleCheckboxes 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Documents/checkbox.html");
		
		
		List<WebElement>allcheckboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement checkbox:allcheckboxes)
		{
			checkbox.click();
			Thread.sleep(500);
			//checkbox.clear();
		 
		}

		
}
}
