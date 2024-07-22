package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo3 
{
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();	
	driver.navigate().to("https://www.amazon.in/s?k=microwave+and+refrigerator&crid=1TBMM7TQQSSRS&sprefix=microwave+and+refrigerator%2Caps%2C398&ref=nb_sb_noss_2");
	Thread.sleep(1000);
	
	//xpath for refrigerator
    driver.findElement(By.xpath("//img[@class='_c2Itd_image_pQREQ']")).click();
}
}
