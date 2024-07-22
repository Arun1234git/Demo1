package Interface_implementaion;

public class demo5 implements Example
{


	public void m1(int a) 
	{
	System.out.println("square of no :"+a*a);	
		
	}


	public void m1(int a, int b) 
	{
		System.out.println("addition of no is :"+a+b);
		
	}
	
	public void m2()
	{
		System.out.println("m2 method ");
	}
	
	public static void main(String[] args) 
	{
		demo5 d5=new demo5();
		d5.m1(5);
		d5.m1(5, 4);
	}

}
