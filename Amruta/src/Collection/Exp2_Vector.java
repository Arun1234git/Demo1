package Collection;

import java.util.Vector;
import java.util.Enumeration;
//import javax.swing.text.html.HTMLDocument.Iterator;
import java.util.Iterator;
import java.util.ListIterator;

public class Exp2_Vector 
{
public static void main(String[] args) 
{
	Vector v=new Vector();
	v.add("amruta");
	v.add(5);
	v.add(78.80f);
	v.add(null);
	v.add('A');
	
	//System.out.println(v);
	System.out.println("print vector data using for loop");
	for(int i=0;i<=v.size()-1;i++)
	{
		System.out.println(v.get(i));
	}
	System.out.println("print vector data using for each loop");
	for(Object s1:v)
	{
		System.out.println(s1);
	}
	System.out.println("print vector data using iterator loop");
	Iterator itr= v.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	System.out.println("print vector data using Listiterator cursor");
	ListIterator litr=v.listIterator();
	while(litr.hasNext())
	{
		System.out.println(litr.next());
	}
	System.out.println("print vector data using Enumeration cursor");
	Enumeration enu=v.elements();
	while(enu.hasMoreElements()) 
	{
	System.out.println(enu.nextElement());	
	}
	
}
}
