package Array;

import java.util.Arrays;

public class String_sorting 
{
	public static void main(String[] args) 
	{
		String[] ar=new String[5];
		
	
			ar[0]="raghav";
			ar[1]="amruta";
			ar[2]="kiran";
			ar[3]="gaurav";
			ar[4]="snehal";
		
		System.out.println("****Array before sorting*********");
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		
		Arrays.sort(ar);
		System.out.println("********Array after sorting******");
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		
		
	}

}
