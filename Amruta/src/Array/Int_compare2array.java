package Array;

import java.util.Arrays;

public class Int_compare2array 
{
		public static void main(String[] args) 
		{
			int [] ar1 = {25,90,45,10,95};
			int [] ar2=  {70,30,55,55,20};
	
			System.out.println(Arrays.equals(ar1, ar2));
			System.out.println("************************");
			
			int [] ar3 = {20,55,35,90,15};
			int [] ar4 = {35,20,90,15,55};
			
			Arrays.sort(ar3);
			Arrays.sort(ar4);
			
			System.out.println(Arrays.equals(ar3, ar4));
			
		}
}
