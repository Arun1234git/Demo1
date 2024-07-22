package access_specifier;

public class Protected_demo1 

{
protected int num;

	Protected_demo1()
	{
	num=10;
	}

protected void squareofnum()
{
	System.out.println(num*num);
}
public static void main(String[] args) 
{
	Protected_demo1 p1=new Protected_demo1();
	System.out.println(p1.num);
	p1.squareofnum();
}
	
}
