package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Exp5_LinkesHasedSet 
{
	public static void main(String[] args) 
	{
	LinkedHashSet lhs=new LinkedHashSet();	
	
	lhs.add("Amruta");
	lhs.add(1);
	lhs.add(90.50f);
	lhs.add('A');
	lhs.add(null);
	lhs.add('A');
	
	
	System.out.println(lhs);
	System.out.println(lhs.size());
	System.out.println(lhs.contains('A'));
	lhs.remove('A');
	System.out.println(lhs);
	
	System.out.println("Print LinkedList data using for each loop");
	for(Object s1:lhs)
	{
		System.out.println(s1);
	}
	System.out.println("Print LinkedList data using Iterator cursor");
	Iterator itr=lhs.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	
	
	}

}
