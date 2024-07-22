package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class HiddeDivision 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.nobroker.in/");
	
	driver.findElement(By.xpath("//div[text()='Log in']")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='signUp-phoneNumber']")).sendKeys("8765432190");
	
	Thread.sleep(1000);
	driver.close();
}
}
