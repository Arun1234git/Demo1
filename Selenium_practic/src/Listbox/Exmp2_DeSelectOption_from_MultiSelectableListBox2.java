package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exmp2_DeSelectOption_from_MultiSelectableListBox2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//Click on create new account link
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		
		//step1:
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		
		//step2
		
		Select s=new Select(month);
		
		//step3 
        s.selectByVisibleText("Aug");
		s.selectByValue("8");
		s.selectByIndex(5);
		
		Thread.sleep(1000);
		s.deselectByVisibleText("USA");
		s.deselectByIndex(0);
}
	
}
