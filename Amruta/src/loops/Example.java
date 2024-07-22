package loops;


public class Example 
{
	int a;
	int b;
	
	Example()
	{
		a=20;
		b=30;
		
	
	}
	public void add()
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) 
	{
		System.out.println("addition of two numbers is");
		Example e1=new Example();
		e1.add();
	}
}
