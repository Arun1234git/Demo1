package Exception_handling;

public class try_catch_approach1
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
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}
		
		String s1="abcd";
		try
		{
			System.out.println(s1.charAt(5));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBoundsException handled");
		}
		System.out.println("hi");
	}
}
