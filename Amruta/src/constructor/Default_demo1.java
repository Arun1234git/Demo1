package constructor;

public class Default_demo1 {
	int num1;				//global variable declaration
	int num2;
	
	
	Default_demo1()			//uder defined constructor
	{
		num1=50;			//global variable initialization
		num2=30;
	}
	

	public static void main(String[] args) 
	{
		
		System.out.println("main method running");
		
		Default_demo1 d1=new Default_demo1();  //user defined constuctor call from 
											   //same class
		
		d1.add();
		d1.sub();
		
		System.out.println("*****************");
		
		
		
		Demo2 d2=new Demo2();			//user defined constuctor call from diff class
		d2.mul();
		d2.div();
		d2.cube();
		
	}
	
	public void add()
	{
		System.out.println(num1+num2);		//global variable usage
		
	}
	public void sub() 
	{
		System.out.println(num1-num2);			//global variable usage
	}
}
