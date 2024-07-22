package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class Exp6_linkesHashedSet2 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add("Amruta");
		al.add(2);
		al.add(70.56f);
		al.add('A');
		al.add(null);
		al.add(2);
		al.add(null);	
		al.add('A');
		System.out.println("Array list data"+al);
		
		HashSet hs=new HashSet(al);
		System.out.println("hashset data"+hs);
	}
}
