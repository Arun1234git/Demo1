package variable;

public class Global_example 
{

	static int num=10;//global static variable
	
	public static void main(String[] args) 
	{
			System.out.println(num);
	
			m1();
			Global_example g5=new Global_example();
			g5.m2();
			
			
			//Global_example2 g6=new Global_example2();
			System.out.println(Global_example2.num_1);
			//Global_example2().

	 
	}
	
	public static void  m1()
	{
		// int num1=60;
		System.out.println(num);/*global vaiable call into static regular method 
										from same class*/
	}
	
	public void m2()
	{
	System.out.println(num);/*global vaiable call into non-static regular method 
									from same class*/
	//System.out.println(num1);
	}
}
