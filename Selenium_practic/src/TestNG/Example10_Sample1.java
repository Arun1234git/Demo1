package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example10_Sample1 
{
	@Test(groups="Setting")
	public void TC1()
	{
		Reporter.log("Running TC1",true);
	}
	
	@Test(groups="Setting")
	public void TC2()
	{
		Reporter.log("Running TC2",true);
	}

	@Test(groups="Profile")
	public void TC3()
	{
		Reporter.log("Running TC3",true);
	}

	@Test(groups="Fund")
	public void TC4()
	{
		Reporter.log("Running TC4",true);
	}

}
