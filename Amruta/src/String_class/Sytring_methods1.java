
package String_class;

public class Sytring_methods1 
{
	public static void main(String[] args) {
		
	
	String s1="";
	String s2="    ";
	String s3="velocity";
	String s4="abcabcab";
	
	//to check whether string is empty or not_isEmpty()
	
	System.out.println(s1.isEmpty());
	System.out.println(s2.isEmpty());
	
	//To find the char of particular index::charAt()
	System.out.println(s3.charAt(7));
	
	//To find the index of specific character::indexOf()  
	//***always shows the index of 1st occurance 
	
	System.out.println(s4.indexOf('c'));
	
	//To find the last index of specific character::indexOf()  
	System.out.println(s4.lastIndexOf('b'));

	
	//to print the string from middle to end
	System.out.println(s4.substring(2));
	
	////to print the string from start to  end index wich are given
	System.out.println(s3.substring(3, 8));

}
}