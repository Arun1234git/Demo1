package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe1_SwitchToFrame 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//switch to frame
		
	    //approach 1:
		//driver.switchTo().frame("iframeResult");		//String frameID
		
		driver.switchTo().frame("iframeResult");	    //String frameName
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']"))); //String WebElement
		
		driver.switchTo().frame(1);					   //String frameIndex
		
		//Click on"click me to display Date and Time" button
		driver.findElement(By.xpath("button[contains(text(),'Click me']")).click();
	}
}
