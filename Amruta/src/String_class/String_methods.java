package String_class;

public class String_methods 
{
	public static void main(String[] args) 
	{
		String s1="velocity";
		String s2="ab cd";
		String s3="abcd";
		String s4="XYZ";
		String s5="VELOCITY";
		String s6="my name is abc";
		
		//calcucate lenghth of string:length()
		
		System.out.println(s1.length());   				//s1=8
		System.out.println(s2.length()); 				//s2=5
		
		//convert sting into upper case:uppercase()
	 
		//System.out.println(s3.toUpperCase()); 			//ABCD
		s3=s3.toUpperCase();
		System.out.println(s3);
		
		
		//convert sting into lower case:loercase()
		
		//System.out.println(s4.toLowerCase());  				//xyz
		s4=s4.toLowerCase();
		System.out.println(s4);
		
		System.out.println("***********************");
		
		//to compare string:equals()
		
		System.out.println(s1.equals(s5));				//false
		
		// to compare string without case check of string:equalsIgnoreCase()
		
		System.out.println(s1.equalsIgnoreCase(s5));           //true
		
		System.out.println("********************");
		
		//to chk the word is present or not in string
		System.out.println(s6.contains("abc"));				//  true
		
		//to chk the string is starting with specific word
		System.out.println(s6.startsWith("my"));	 		//  true
		
		//to chk the string is starting with specific word
		System.out.println(s6.endsWith("abc"));		 		//  true
		
		
		
		
	}
}
