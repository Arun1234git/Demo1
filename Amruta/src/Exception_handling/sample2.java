package Exception_handling;

public class sample2 
{
	public static void main(String[] args) 
	{
		String [] ar= {"abc","xyz","abc1"};
		
		try
		{
			System.out.println(ar[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(ar[0]);
		}
		System.out.println("hi");
	}
}
