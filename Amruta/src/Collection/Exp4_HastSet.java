package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Exp4_HastSet 
{
	public static void main(String[] args) 
	{
	HashSet hs=new HashSet();	
	
	hs.add("Amruta");
	hs.add(1);
	hs.add(90.50f);
	hs.add('A');
	hs.add(null);
	hs.add('A');
	
	
	
	System.out.println(hs.size());
	System.out.println(hs.contains('A'));
	System.out.println("Print LinkedList data using for each loop");
	for(Object s1:hs)
	{
		System.out.println(s1);
	}
	System.out.println("Print LinkedList data using Iterator cursor");
	Iterator itr=hs.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	}
}
