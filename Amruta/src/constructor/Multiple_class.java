
package constructor;


public class Multiple_class
		{
	public static void main(String[] args) 
	{
		m1();
		demo2 d1=new demo2();
		d1.m2();
		
		demo3 d2=new demo3();
		d2.m3();
		
	}
public static void m1() 
{
	System.out.println("Running m1 methhod from Multiple_class");
}

}
class demo2
{
	public void m2()
	{
		System.out.println("Running m2 methhod from demo2 class");
	}
}

class demo3
{
	public void m3()
	{
		System.out.println("Running m3 methhod from demo3 class");
	}
}