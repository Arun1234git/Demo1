package Exception_handling;

public class try_cathch_caonditions 
{
	public static void main(String[] args) 
	{
		String [] ar= {"abc","xyz","abc1"};
		
		try
		{
			System.out.println(ar[5]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException handled");
		}
		catch(StringIndexOutOfBoundsException E)
		{
			System.out.println("StringIndexOutOfBoundsException handled");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("please enter valid index from 0 to "+(ar.length-1));
		}
		System.out.println("hi");
		
		
		
		
		
	}
}
