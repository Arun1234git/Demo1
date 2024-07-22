package method;

public class sample5 {

	public static void main(String[] args) {
		
		System.out.println("****addition");
		
		//method call of add
		add(50,100);			//variable initialization
		add(200,100);
		//add(500,600);
		
		System.out.println("**subtraction*****");
		sub(650,120);
		sub(450,200);
		
		System.out.println("***multiplication***");
		sample5 s5=new sample5();
		s5.mul(15, 6);
		s5.mul(8, 5);
		
		System.out.println("***division*****");
		s5.div(90, 6);
		s5.div(150, 4);
		
		System.out.println("**cube**");
		sample6 s6=new sample6();
		s6.cube(6);
		s6.cube(3);
	}
	

	public static void add(int num1,int num2)		//variable declaration 
	{
		System.out.println(num1+num2);
	}

	public static void sub(int num1,int num2)
	{
		System.out.println(num1-num2);
	}
	
	public void mul(int num1,int num2)
	{
		System.out.println(num2*num2);
	}
	
	public void div(int num1,int num2)
	{
		System.out.println(num1/num2);
	}
	
	
}

