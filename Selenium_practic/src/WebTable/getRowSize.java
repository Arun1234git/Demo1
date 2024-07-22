package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRowSize 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Documents/webtable.html");

		driver.findElement(By.xpath("//table[@id='1234']//tr[4]"));
		int size=driver.findElements(By.xpath("//table[@id='1234']//tr[4]")).size();

		
		
	}
}
