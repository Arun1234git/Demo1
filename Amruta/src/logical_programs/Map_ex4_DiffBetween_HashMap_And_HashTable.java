package logical_programs;

import java.util.HashMap;
import java.util.Hashtable;

public class Map_ex4_DiffBetween_HashMap_And_HashTable 
{
	public static void main(String[] args) {
		
	
	/*Hashtable ht=new Hashtable<>();
	ht.put("amruta",1);
	ht.put("kiran",null);
	ht.put("raghav", null);
	ht.put("null", 1);
	System.out.println(ht);*/
	
	HashMap hm=new HashMap<>();
	hm.put("amruta", 1);
	hm.put("kiran", null);
	hm.put("raghav", null);
	hm.put("abc", null);
	hm.put(null, 2);
	hm.put(null, 1);
	
	System.out.println(hm);
	
	
}
	
}
