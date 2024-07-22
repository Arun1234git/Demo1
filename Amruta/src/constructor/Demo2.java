package constructor;

public class Demo2 {
	
	int a;		//global variable
	int b;
	
	
	Demo2()			//user defined constuctor in diff class
	{
		a=15;
		b=10;
	}

	public void mul()
	{
		System.out.println(a*b);
	}
	
	public void div()
	{
		System.out.println(a/b );
		
	}
	public void cube()
	{
		System.out.println(a*a*a);
	}
}
