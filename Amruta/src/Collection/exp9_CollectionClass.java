package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class exp9_CollectionClass 
{
		public static void main(String[] args) 
			{
				ArrayList<String> al=new ArrayList<String>();
				al.add("raghav");
				al.add("Amruta");
				al.add("kiran");
				al.add("rani");
				
				System.out.println(al);
				
				Collections.sort(al);
				System.out.println(al);
				
				Collections.reverse(al);
				System.out.println(al);

			}
}
