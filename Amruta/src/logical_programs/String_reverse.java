package logical_programs;

public class String_reverse
{
public static void main(String[] args) 
{
	String s1="abcd";
	String rev="";
	
	for(int i=s1.length()-1;i>=0;i--)
	//for(int i=3;i>=0;i--)
	{ 
		rev=rev+s1.charAt(i);
				
	}
	System.out.println("Reverse string is : "+rev);
	System.out.println("to check string is palindrome or not");
	
	if(s1.equals(rev))
	{
		System.out.println("String is palindrome");
	}
	else
	{
		System.out.println("String is not  palindrome");
	}
}
}
