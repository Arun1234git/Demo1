package this_super;

public class Super_stmt1 extends Super_stmt
{
	Super_stmt1()
	{
		super();								//calling constructor from super class
		System.out.println("running from sub class constuctor");
	}
	
	public static void main(String[] args) 
	{
		Super_stmt1 s1=new Super_stmt1();
	}
	
}
