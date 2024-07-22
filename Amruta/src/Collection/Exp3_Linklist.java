package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Exp3_Linklist 
{
public static void main(String[] args) 
{
	LinkedList ll=new LinkedList();
	ll.add("Amruta");
	ll.add(1);
	ll.add(90.50f);
	ll.add('A');
	ll.add(null);
	ll.add('A');
	
	System.out.println("Print LinkedList data using for loop");
	for(int i=0;i<=ll.size()-1;i++)
	{
		System.out.println(ll.get(i));
	}
	System.out.println("Print LinkedList data using for each loop");
	for(Object s1:ll)
	{
		System.out.println(s1);
	}
	System.out.println("Print LinkedList data using Iterator cursor");
	Iterator itr=ll.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println("Print LinkedList data using ListIterator cursor");
	ListIterator litr=ll.listIterator();
	while(litr.hasNext())
	{
		System.out.println(litr.next());
	}
	
	
}
}
