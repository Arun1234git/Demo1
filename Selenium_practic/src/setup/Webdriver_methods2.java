package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_methods2 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver =new ChromeDriver();
	Thread.sleep(2000);
	
	driver.navigate().to("https://www.facebook.com");
	Thread.sleep(2000);
	
	driver.navigate().to("https://www.google.com");
	Thread.sleep(2000);
	
	driver.navigate().back();
	Thread.sleep(2000);
	
	driver.navigate().forward();
	Thread.sleep(2000);
	
	driver.navigate().refresh();

	
	
}
}
