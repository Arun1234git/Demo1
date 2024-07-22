package this_super;

public class This_stmt
{
	This_stmt()
	{
		this("mahesh");
		System.out.println("running from without parameter constuctor");
	}
	
	This_stmt(String s1)
	{
		this(10);
		System.out.println("running from string parameter constuctor");
	}
	
	This_stmt(int a)
	{
		System.out.println("running from int parameter constuctor");
	}
	
	public static void main(String[] args) 
	{
		This_stmt t1=new This_stmt();
		
	}
}
