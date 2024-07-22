package Exception_handling;

public class sample3
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
			System.out.println("please enter valid index from 0 to "+(ar.length-1));
		}
		System.out.println("hi");
	}
}
