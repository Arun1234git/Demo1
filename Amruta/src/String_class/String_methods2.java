package String_class;

public class String_methods2
{
public static void main(String[] args) 
	{
	String s1="velocity";
	String s2="";
	String s3="abcabcab";
	String s4="xyz";
	String s5="  xyz ";
	String s6="my name is abc";
	
	//to concat 2 or more strings:add string::::concat();
	System.out.println(s1+s3);
	System.out.println(s1.concat(s3));
	
	
	//To trim means to remove space from string[from before or after the string]::trim()
	//System.out.println(s5);
	System.out.println(s5.trim());
	
	
	System.out.println(s6.replace("abc", "xyz"));
	System.out.println(s1.replace("city","CITY"));
	
	
	System.out.println("****************");
	System.out.println("split method");
	
	
	String s7="my name is abc";
	String [] ar=s7.split(" ");		//{my(0), name(1),is(2),abc(3)}
		
		System.out.println(ar.length);
		System.out.println(ar[2]);
	
	}
}
