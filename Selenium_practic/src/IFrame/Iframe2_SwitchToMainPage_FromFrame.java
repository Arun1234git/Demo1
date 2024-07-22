package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe2_SwitchToMainPage_FromFrame 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//switch to frame
		driver.switchTo().frame("iframeResult");		//String frameID
		
		//Click on"click me to display Date and Time" button from frame
		driver.findElement(By.xpath("button[contains(text(),'Click me']")).click();
		
		//Switch to main  page from IFrame
		driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();
		
		//click on "open menu"btn from main page
		driver.findElement(By.xpath("//a[@id='menubutton']")).click();
		
		
	}
}
