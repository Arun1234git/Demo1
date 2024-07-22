package Interface_implementaion;

public class default_execution implements default_use1
{
	public static void main(String[] args) 
	{
		
		default_execution d1=new default_execution();
		d1.m1();
		d1.m2();
		d1.m3();
		d1.m4();
		d1.m5();
	}


	public void m1() 
	{
		
		System.out.println("method m1 running from interface default_use");
	}

	public void m2()
	{
		System.out.println("method m2 running from interface default_use");
		
	}


	public void m3() 
	{
		System.out.println("method m3 running from interface default_use1");
	}

	
	public void m4() 
	{
		System.out.println("method m4 running from interface default_use1");
	}
}
