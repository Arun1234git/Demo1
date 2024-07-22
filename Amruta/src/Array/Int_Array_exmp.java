package Array;

public class Int_Array_exmp 
{
public static void main(String[] args) 
{
	int ar[]=new int[5];
	
	ar[0]=35;
	ar[1]=60;;
	ar[2]=45;
	ar[3]=30;
	ar[4]=20;
	
	
	System.out.println("**************original data**************");
	
	//for(int i=o;i<=4;i++)
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
	}
	
	System.out.println("****Arraay in reverse order");
	
	for(int i=ar.length-1;i>=0;i--)
	{
		System.out.println(ar[i]);
	}
	
}
}
