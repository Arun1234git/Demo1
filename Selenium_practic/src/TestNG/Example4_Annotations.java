package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example4_Annotations 
{
	@BeforeClass
	public void openBrowser()
	{
	Reporter.log("*****Open browser******",true);
	}
	
	@BeforeMethod
	public void loginToApp() 
	{
		Reporter.log("------Login to App",true);
	}
	
	@Test
	public void verifylogo2()
	{
		Reporter.log("Running verifylogo2 TC",true);
	}
	
	@Test
	public void verifylogo1()
	{
		Reporter.log("Running verifylogo1 TC",true);
	}
	
	@AfterMethod
	public void logoutfromApp()
	{
		Reporter.log("-----Logout from App-----",true);
	}
	
	@AfterClass
    public void closeBrowser()
	{
		Reporter.log("*********Close browser*****",true);
	}
}