package PopUp;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class switchToChildWindow 
{
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://skpatro.github.io.demo/links/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	//click on NewTab button from  main page
	
	driver.findElement(By.xpath("//input[@name='NewTab']")).click();
	
	//Get child window ID
	Set<String> allid =driver.getWindowHandles();
	//{MAINPAGEid,childId}
	ArrayList<String> al= new ArrayList<String>(allid);
	//{MAINPAGEid(0),childId(1)}
	
	String childWindowId=al.get(1);
	
	//switch to child window
	driver.switchTo().window(childWindowId);
	
	//click on "training"link from child window
	
   driver.findElement(By.xpath("//span[text()='traning']")).click();	
}
}
