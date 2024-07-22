package access_specifier;

public class Private_demo1 
{

	private int num1;
	private int num2;
	
	Private_demo1()
	{
		num1=10;
		num2=20;
	}
	
	private void add()
	{
		System.out.println("Addition of no 1 and no 2 is "+ " :"+(num1+num2));
	}
	public static void main(String[] args) 
	{
		Private_demo1 p1=new Private_demo1();
		p1.add();
		
		System.out.println(p1.num1);
		
	}
}
