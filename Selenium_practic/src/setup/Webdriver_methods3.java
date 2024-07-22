package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_methods3 
{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	Thread.sleep(2000);
	
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.google.com");
	
	driver.get("https://www.gmail.com");
	Thread.sleep(2000);
	
	driver.switchTo().newWindow(WindowType.WINDOW );
	driver.get("https://www.google.com");
	
	



}
}
