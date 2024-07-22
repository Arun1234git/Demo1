package Collection;

import java.util.ArrayList;

public class exp11_Convert_Collection_to_Array 
{
	public static void main(String[] args) 
	{ 
		ArrayList<String> al=new ArrayList<String>();
		al.add("raghav");
		al.add("Amruta");
		al.add("kiran");
		al.add("rani");
		
		Object[] ar=al.toArray();
		System.out.println(ar[3]);
		System.out.println(al);
		
	}
}
