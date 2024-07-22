package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example5_Keyword3_priority2 
{
	@Test(priority=3)
	public void TC1()
	{
		Reporter.log("***Running TC1*****",true);
	}
	
	@Test(priority=1)
	public void TC2()
	{
		Reporter.log("****Running TC2***",true);
	}
	
	@Test(priority=2)
	public void TC3()
	{
		Reporter.log("****Running TC3***",true);
	}
	@Test              //by default priority is 0
	public void TC4()
	{
		Reporter.log("***Running TC4*****",true);
	}
	
	@Test				//by default priority is 0
	public void TC5()
	{
		Reporter.log("****Running TC5***",true);
	}
	
	@Test(priority=-2)		///negative priority 
	public void TC6()
	{
		Reporter.log("****Running TC6***",true);
	}
}
