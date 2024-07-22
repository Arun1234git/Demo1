package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_PopUp2 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("100");
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Alert alt=driver.switchTo().alert();
		
		String text=alt.getText();
		System.out.println(text);
		
		alt.dismiss();
		alt.accept();
		alt.accept();
		
		alt.sendKeys("9999999999");

	}
}
