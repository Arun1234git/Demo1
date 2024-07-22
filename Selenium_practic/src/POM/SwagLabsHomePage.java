package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsHomePage 
{
@FindBy(xpath="//div[text()='Swag Labs']") private WebElement logoText;
@FindBy(xpath="//div[@class='bm-burger-button']")private WebElement openMenubtn;

	public SwagLabsHomePage(WebDriver driver)
	{
	PageFactory.initElements(driver,this);
	
	}
	public void verifylogo()
	{
		String actlogoText=logoText.getText();
		String expLogoText="Swag Labs";
		if(actlogoText.equals(expLogoText))
		{
			System.out.println("TC pass");
		}
		else
		{
			System.out.println("TC fail");
		}
		
	}
	public void clickOpenNBtn()
	{
		openMenubtn.click();
	}
	
	

	
}
