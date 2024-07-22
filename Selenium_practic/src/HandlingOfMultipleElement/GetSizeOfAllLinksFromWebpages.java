package HandlingOfMultipleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeOfAllLinksFromWebpages 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//List<WebElement> allLinks =  driver.findElements(By.xpath("//a"));
		//int linkSize=allLinks.size();
		//System.out.println(linkSize);
		
		int linkSize=driver.findElements(By.xpath("//a")).size();
		System.out.println(linkSize);
		
		//System.out.println(driver.findElements(By.xpath("//a")).size());
		

}
}
