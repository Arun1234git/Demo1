package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class exp8_Generic1 
{
public static void main(String[] args) 
{
	ArrayList<String> al=new ArrayList<String>();
	al.add("abc");
	al.add("pqr");
	al.add("xyz");
	al.add("mno");
	//al.add(100);
	//al.add(200);
	System.out.println(al);
	
	System.out.println("print Arraylist data using for each loop");
	
	for(String s1:al)
	{
		System.out.println(s1);
	}
	
	System.out.println("print data using Iterator");
	Iterator itr=al.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
}
}
