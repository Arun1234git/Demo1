package access_specifier;

public class Default_demo1 
{

	  
	 int num1;
	 int num2;
	
	 Default_demo1()
	{
		num1=10;
		num2=20;
	}
	
	void add()
	{
		System.out.println("Addition of no 1 and no 2 is "+ " :"+(num1+num2));
	}
	
	public static void main(String[] args) 
	{
		Default_demo1 d1=new Default_demo1();
		d1.add();
		
		System.out.println(d1.num1);
		
		System.out.println(d1.num2);
	}
}
