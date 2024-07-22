package constructor;

public class Demo3 {

	int num1;
	int num2;
	String name;
	
	
	//constructor overloading::same name constructor with different parameters
	Demo3()
	{
		num1=30;
		num2=20;
		
	}
	Demo3(int a,int b)
	{
		num1=a;
		num2=b;
		
	}
	Demo3(String s1)
	{
		name=s1;
	}
	
	Demo3(int a,String s1)
	{
		num1=a;
		name=s1;
		
	}
	
	public static void main(String[] args) 
	{
		Demo3 d3=new Demo3();
		d3.add();
		d3.mul();
		//d3.stud();
		
		System.out.println("*********************");
		
		Demo3 D4=new Demo3(50,40);
		D4.add();
		D4.mul();
		
		
		System.out.println("********************");
		Demo3 D5=new Demo3("hello");
		D5.stud();
	
		
		System.out.println("*******************");
		Demo3 d6=new Demo3(10,"amruta");
		d6.emp();
		
	
	}
public void add()
{
	System.out.println(num1+num2);
	
}
public void mul() 
{
	System.out.println(num1*num2);
}

public void stud()
{
	System.out.println(name);
}
public void emp() 
{
	System.out.println(num1+" "+name);
}
}