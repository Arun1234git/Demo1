package Exception_handling;

public class try_cathch_conditions1 
{
	public static void main(String[] args) 
	{
		String [] ar= {"abc","xyz","abc1"};
		
		try
		{
			System.out.println(ar[5]);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("generic exception handled");
		}
		System.out.println("hello");
		
		
				
	
		
}
}