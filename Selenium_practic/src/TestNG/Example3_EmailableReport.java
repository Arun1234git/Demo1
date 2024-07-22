package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example3_EmailableReport 
{
@Test
	public void TC1()
	{
		Reporter.log("running test case 1", true);
	}

@Test
	public void TC2()
	{
		Reporter.log("Running TC2",true);
	}
}
