package access_specifier;

public class Public_exp1 
{
	public int num;
	
	public Public_exp1()
	{
		num=10;
	}
	
	public void squareofno()
	{
		System.out.println(num*num);
	}
	public static void main(String[] args) 
	{
		Public_exp1 p1=new Public_exp1();
		System.out.println(p1.num);
		p1.squareofno();
	}
	
}
