package Collection;

import java.util.ArrayList;

public class Exp1_Arraylist 
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
		
		System.out.println(al); 
		System.out.println(al.get(3));
		System.out.println(al.size());
		System.out.println(al.contains("Amruta"));
		al.set(3,"Raghav");
		al.set(0, 11);
		System.out.println(al);
		al.remove(3);
		System.out.println(al); 
		
		
		int [] ar= {50,30,50,60,75,70};
		System.out.println("print array using for each loop");
		for(Object s1:ar)
		{
			System.out.println(s1);
		}
		
		System.out.println("print specific data from");
		int index=0;
		for(Object s1:ar)
		{
			if(index<4)
			{
			System.out.println(s1);
			} 
			index++;
		}
}
}