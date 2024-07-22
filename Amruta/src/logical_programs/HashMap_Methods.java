package logical_programs;

import java.util.HashMap;
import java.util.Set;

public class HashMap_Methods
{
	public static void main(String[] args)
	{
	HashMap<Integer, String> mp=new HashMap<>();
	//1: put(k,v) -> to add key & value in map
	mp.put(101, "ramesh");
	mp.put(102, "mahesh");
	mp.put(103, "suresh");
	System.out.println(mp);
	//2: put(k,v) -> update value of already existing key
	mp.put(101, "RAMESH");
	System.out.println(mp);
	//3: containsKey(key) -> to verify specific key present or not
	System.out.println(mp.containsKey(33));
	//4: get(key) -> get value of specific key
	System.out.println(mp.get(101));
	System.out.println("-----");
	//5: keyset() -> to get all keys from map
	// return type is Set<key>
	Set<Integer> allKeys = mp.keySet();
	for(Integer key:allKeys)
	{
	System.out.println(key);
	}
	//6: get all keys & values
	for(Integer key:allKeys)
	{
	System.out.println(key+"-"+mp.get(key));
	}
	}
}

