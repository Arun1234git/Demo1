package chromebrowseroptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ex2_chromeoptions_incognito_mode
{
public static void main(String[] args) 
{
	ChromeOptions cs=new ChromeOptions();
	cs.addArguments("--incognito");
	WebDriver driver=new ChromeDriver(cs);
	driver.get("https://www.google.com");
	
}
}
