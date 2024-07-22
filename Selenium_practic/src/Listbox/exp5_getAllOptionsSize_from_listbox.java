package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class exp5_getAllOptionsSize_from_listbox 
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/HP/Documents/web.html");
	
	WebElement SelectCountry=driver.findElement(By.xpath("//select[@id='1234'])"));
	Select s=new Select(SelectCountry);
	
	//List<WebElement> alloptions =s.getOptions();
	//System.out.println(alloptions.size());
	
	
	System.out.println(s.getOptions().size());
	
	
	
}
}
