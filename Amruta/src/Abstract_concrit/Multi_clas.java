package Abstract_concrit;

public class Multi_clas 
{
	public static void main(String[] args) 
	{
		System.out.println("execution of Multi class");
		Multi_clas m1=new Multi_clas();
		m1.m1();
		m2();
		
	}
	public void m1()
	{
		System.out.println("m1 method");
	}
	public static void m2()
	{
		System.out.println("m2 method");
	}

}
class demo1 extends Multi_clas
{
	public static void main(String[] args) 
	{
		System.out.println("execution of demo1 class");
	}
	
	public void m3()
	{
		System.out.println("m3 method");
	}
	public static void m4()
	{
		System.out.println("m4 method");
	}

}

class demo2

{
	
	public static void main(String[] args) 
	{
		System.out.println("execution of demo2 class");
	}
	public void m5()
	{
		System.out.println("m5 method");
	}
	public static void m6()
	{
		System.out.println("m6 method");
	}


}

