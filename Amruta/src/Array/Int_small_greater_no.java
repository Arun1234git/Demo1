package Array;

import java.util.Arrays;

public class Int_small_greater_no 
{
	public static void main(String[] args)
	{
		int [] in=new int[5];
		in[0]=70;
		in[1]=65;
		in[2]=40;
		in[3]=85;
		in[4]=35;
		
		Arrays.sort(in);
		System.out.println("Smallest number is :" +in[0]);
		System.out.println("greatest number is :" +in[in.length-1]);
		
	}
}
