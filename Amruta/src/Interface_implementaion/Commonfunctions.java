package Interface_implementaion;

public interface Commonfunctions 
{

	public static void getexceldata()
	{
			int a=10;
			System.out.println("code to fetch data from excxel sheet");
			System.out.println(a);
			getpath();
	}
	
	void method1();
	
	
	
		/*public static void main(String[] args)    we can write main method in interface 
													but we are not going to use this in
	{												real time
		System.out.println("execution starterd");
		getexceldata();
		getpath();
	}*/
	
	
	private static void getpath()
	{
		System.out.println("code to get path");
	}
	
	
	
	
	
	
	
	/*default void m1()			cannot create object in interface
	{
		System.out.println("abcd");
	}*/
	
}
