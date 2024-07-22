package this_super;

public class This_super_keyword2 extends This_super_keyword1		//subclass
{
	//int a=30;								//global variable from super class
	
	int a=20;								//global varibale from same class

	public void m1()
	{
	
	int a=10;
	System.out.println(a);  				//local variable
	System.out.println(this.a);				//global variable from same class
	System.out.println(super.a);  			//global variable form super class
	
	}
	public static void main(String[] args) 
	{
	
		This_super_keyword2 t1=new This_super_keyword2();
		t1.m1(); 
	}

}
