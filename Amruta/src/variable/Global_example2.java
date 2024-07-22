package variable;

public class Global_example2 
{
	static int num_1=30;//global static variable
	
	int num1=40;//global non static variable
	
	
	
	public static void main(String[] args) 
	{
		Global_example2 g7=new Global_example2();
		System.out.println(g7.num1);
		m1();
		
	}
	
	public static void  m1()
	{
		
		System.out.println(num_1);/* static global vaiable call  
										from same class*/
		
		Global_example2 g7=new Global_example2();
		System.out.println(g7.num1);
		
		
	}
	
	public void m2()
	{
	System.out.println(num_1);	/*non static global vaiable call into 
	                              non-static regular method from same class*/
	
	System.out.println(num1);
	}
}
