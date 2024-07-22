package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class exmp_2DeSelectOption1_from_MultiSelectableListBox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Documents/web.html");
		
	
		
		//step1:Identify listbox
		WebElement selectcountry=driver.findElement(By.xpath("//select[@id='1234']"));
		
		//step2
		
		Select s=new Select(selectcountry);
		
		//step3
		s.selectByIndex(1);
		s.selectByIndex(3);
		s.selectByIndex(0);
		
		Thread.sleep(2000);
		
		s.deselectAll();
}
	
}
