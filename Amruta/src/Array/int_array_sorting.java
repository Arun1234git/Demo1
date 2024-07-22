package Array;

import java.util.Arrays;

public class int_array_sorting 
{
	public static void main(String[] args) 
	{
		int ar[]=new int[5];
		
		ar[0]=30;
		ar[1]=25;;
		ar[2]=45;
		ar[3]=90;
		ar[4]=70;
		
		System.out.println("**************original data**************");
		
		//for(int i=o;i<=4;i++)
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("*****print data in ascending order");
		Arrays.sort(ar);
		for(int i=0;i<=4;i++)
		{
		System.out.println(ar[i]);
	    }
		
		
		System.out.println("**print data in descending order****");
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
}

}
