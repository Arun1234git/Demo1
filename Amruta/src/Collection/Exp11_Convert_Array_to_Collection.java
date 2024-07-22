package Collection;

import java.util.List;

import java.util.Arrays;

public class Exp11_Convert_Array_to_Collection 
{
	public static void main(String[] args) 
	{
		String[] ar= {"abc","hgf","jhgfh","hgvfh"};
	List<String> al = Arrays.asList(ar);
	System.out.println(al.get(1));
	
	Integer [] arr= {89,65,40,11};
	
	List<Integer> all=Arrays.asList(arr);
	System.out.println(all.get(0));
	

}
}