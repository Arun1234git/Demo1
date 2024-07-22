package inheritance;

public class This_super 
{

	int a=30;
	
	public void sample()
	{
		int a=10;
		int b=50;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(b);
	}
	public static void main(String[] args)
	{
		This_super t1=new This_super();
		t1.sample();
	}

}
