package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class exp10_ListIterator_BidirectionalCursor 
{
public static void main(String[] args) 
{
	ArrayList<String> al=new ArrayList<String>();
	al.add("raghav");
	al.add("Amruta");
	al.add("kiran");
	al.add("rani");
	
	System.out.println(al);
	ListIterator<String> litr=al.listIterator();
	System.out.println("forward direction");
	while(litr.hasNext())
	{
		System.out.println(litr.next());
	}
	System.out.println("reverse direction");
	while(litr.hasPrevious())
	{
		System.out.println(litr.previous());
	}
}
}
