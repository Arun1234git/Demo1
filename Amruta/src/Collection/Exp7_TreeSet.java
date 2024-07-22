package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Exp7_TreeSet
{
	public static void main(String[] args) 
	{
	TreeSet ts=new TreeSet();
	ts.add(8);
	ts.add(6);
	ts.add(9);
	ts.add(3);
	ts.add(1);
	//ts.add(null);
	//ts.add("amruta");
	
	System.out.println("treeset data"+ts);
	System.out.println("treeset"+" "+ts.size());
	System.out.println(ts.contains(3));
	System.out.println(ts.remove(6));
	System.out.println(ts);
	
	System.out.println("1st data"+ts.first());			//get first position data
	System.out.println("last data"+ts.last());          //get last position data
	
	System.out.println("print treeset data using for each loop");
	for(Object s1:ts)
	{
		System.out.println(s1);
	}
	System.out.println("print data using iterator cursor");
	Iterator itr=ts.iterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	System.out.println("print data using  descending iterator cursor");
	Iterator ditr=ts.descendingIterator();
	while(ditr.hasNext())
	{
	System.out.println(ditr.next());
	}
	TreeSet tr=new TreeSet();
	tr.add("abc");
	tr.add("raghav");
	tr.add("kiran");
	tr.add("amruta");
	tr.add("pqr");
	System.out.println(tr);
	tr.pollFirst();				//delete 1st position data
	tr.pollLast();				//delete last position data
	System.out.println(tr);
	
	}
}



