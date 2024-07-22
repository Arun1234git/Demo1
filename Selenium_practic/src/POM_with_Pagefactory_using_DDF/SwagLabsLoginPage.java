package POM_with_Pagefactory_using_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsLoginPage 
{
	@FindBy(xpath="//input[@id='user-name']")  private WebElement UN;  
	//private WebElement UN=driver.findElement(By.xpath""));Early/basic initialization
	@FindBy(xpath="//input[@id='password']")  private WebElement PWD;
	@FindBy(xpath="//input[@name='login-button']")  private WebElement loginbtn;
	@FindBy(xpath="div//[@class='error-message-container error']")private WebElement errorMsg;
	
	public SwagLabsLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	 
	public void inpSwagLabsLoginPageUsername(String username) /*convert this method
	with parameter*/
	{
		UN.sendKeys(username);
	}
	public void inpSwagLabsLoginPagePassword(String password)
	{
		PWD.sendKeys(password);
	}
	
	public void clickSwagLabsLoginPageBtn()
	{
		loginbtn.click();
	}
	
	public void verifySwagLabsLoginPageErrorMsg()
	{
		if(errorMsg.isDisplayed())
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
}
