package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsLoginTest 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.manage().window().maximize();
	
	SwagLabsLoginPage login= new SwagLabsLoginPage(driver);
	login.enterUN();
	Thread.sleep(1000);
	login.enterPWD();
	Thread.sleep(1000);
	login.clickonLoginBtn();
	
	
	SwagLabsHomePage home=new SwagLabsHomePage(driver);
	home.verifylogo();
	home.clickOpenNBtn();
	Thread.sleep(1000);
	SwagLabsOpenMenuPage menu=new SwagLabsOpenMenuPage(driver);
	menu.ClickOnLogoutBtn();
	
 
	
}
}
