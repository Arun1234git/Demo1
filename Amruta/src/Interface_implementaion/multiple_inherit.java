package Interface_implementaion;

public class multiple_inherit implements Sample1,Sample2 	//implementation class 
{
//Multiple inheritance used by interface
	
	public void m1() 
	{
		
		System.out.println("method m1 running from interface sample1");
	}


	public void m2() 
	{
	
		System.out.println("method m2 running from interface sample1");

		
	}
	public void m3() 
	{
		
		System.out.println("method m3 running from interface sample2");

		
	}
	public void m4() 
	{
		
		System.out.println("method m4 running from interface sample2");

		
	}

}
