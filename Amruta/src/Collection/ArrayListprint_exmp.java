package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;



public class ArrayListprint_exmp 
{
public static void main(String[] args) 
{
	ArrayList al=new ArrayList();
	al.add("Raghav");
	al.add(1);
	al.add(91.87f);
	al.add('A');
	al.add(null);
	//al.add(1);
	//al.add(null);
	
	System.out.println("********Print ArrayList data using for loop ************ ");
	for(int i=0;i<=al.size()-1;i++)
	{
		System.out.println(al.get(i));
	}
	System.out.println("********Print ArrayList data using for each loop ************ ");
	for(Object s1:al)
	{
		System.out.println(s1);
	}
	System.out.println("********Print ArrayList data using Iterator cursor ************ ");
	Iterator itr=al.iterator();

	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
		
	System.out.println("********Print ArrayList data using Iterator cursor ************ ");

	ListIterator litr=al.listIterator();
	while(litr.hasNext())
	{
		System.out.println(litr.next());
	}
	

}
}
