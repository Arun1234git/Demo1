package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exp1_WithoutDDf 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(2000);
		String actlogotext=driver.findElement(By.xpath("//div[text()='Swag Labs']")).getText();
		System.out.println(actlogotext);
		
		String explogotext="Swag Labs";
		if(actlogotext.equals(explogotext))
		{
			System.out.println("TC pass");
		}
		else
		{
			System.out.println("TC fail");
		}
		driver.findElement(By.xpath("//div[@class='bm-burger-button']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
		
	}
}
