package HandlingOfMultipleElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class PrintAllLinksFromWebpage 
{
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	List<WebElement> allLinks =  driver.findElements(By.xpath("//a"));
	
	System.out.println(allLinks.size());
	for(WebElement link:allLinks)
	{
		
		System.out.println(link.getText());
	}
	
}
}
