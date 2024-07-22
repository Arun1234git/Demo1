package String_class;

public class String_palindrome 
{
	public static void main(String[] args) 
	{
		String s1="mamam";
		String rev="";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		System.out.println("reverse string is :: "+rev);
		
		if(s1.equals(rev))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("string is not palindrome");
		}
	}
	
}
