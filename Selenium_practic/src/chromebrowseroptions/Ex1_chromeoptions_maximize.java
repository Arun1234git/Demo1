package chromebrowseroptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ex1_chromeoptions_maximize 
{
public static void main(String[] args) 
{
	ChromeOptions cp = new ChromeOptions();
	cp.addArguments("start-maximized");
	WebDriver driver = new ChromeDriver(cp);
	driver.get("https://www.facebook.com/");
	

}
}
