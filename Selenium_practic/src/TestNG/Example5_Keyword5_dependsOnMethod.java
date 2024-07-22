package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example5_Keyword5_dependsOnMethod 

{
	@Test
	public void login()
	{
		Reporter.log("Running login TC",true);
	}
	
	@Test(dependsOnMethods= {"login"})
	public void logout()
	{
		Reporter.log("Running logout TC",true);
	}
	
}
