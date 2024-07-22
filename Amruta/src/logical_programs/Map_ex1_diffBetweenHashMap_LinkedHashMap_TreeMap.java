package logical_programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Map_ex1_diffBetweenHashMap_LinkedHashMap_TreeMap 
{
	public static void main(String[] args)
	{
	//Order of insertion :- Ascending order of Asci value
	HashMap<Integer, String> mp=new HashMap<>();
			mp.put(101, "ramesh");
			mp.put(2, "mahesh");
			mp.put(3, "suresh");
			System.out.println(mp);
			System.out.println("----");
	//Order of insertion :- maintained
	LinkedHashMap<Integer, String> lmp=new LinkedHashMap<>();
			lmp.put(101, "ramesh");
			lmp.put(2, "mahesh");
			lmp.put(3, "suresh");
			System.out.println(lmp);
	//Order of insertion :- Ascending order
	TreeMap<Integer, String> trmp=new TreeMap<>();
			trmp.put(101, "ramesh");
			trmp.put(2, "mahesh");
			trmp.put(3, "suresh");
			System.out.println(trmp);
	}
}

