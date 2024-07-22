package upcasting;

public class Son extends Father
{
	
	public  void mobile()
	{
		System.out.println("mobile:samsung s20");
	}
	
	
	public void car()				//method overriding
	{
		System.out.println("car:BMW");
	}
	
	public void money()
	{
		System.out.println("money:15l");		//method overriding
		
	}
	
}
