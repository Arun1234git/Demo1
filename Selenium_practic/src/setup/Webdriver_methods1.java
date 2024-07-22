package setup;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_methods1 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	
	Thread.sleep(2000);
	
	driver.manage().window().maximize();
	
	//Options s1=driver.manage();
	//Window s2 = s1.window();
	//s2.maximize();
	
	Thread.sleep(3000);
	//driver.manage().window().minimize();
	Options s1= driver.manage();
	Window s2=s1.window();
	s2.minimize();
	

	Thread.sleep(3000);
	
	driver.manage().window().fullscreen();
	

	Thread.sleep(2000);
	driver.close();
	
	
}
}
