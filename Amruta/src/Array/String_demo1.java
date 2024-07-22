package Array;

public class String_demo1 
{

	public static void main(String[] args) 
	{	
		//Array declaration
		String[] ar=new String[5];
		
		//Array initialization
			ar[0]="Raghav";
			ar[1]="amruta";
			ar[2]="kiran";
			ar[3]="gaurav";
			ar[4]="snehal";
		//	ar[5]="abcd";   	
									/* Example 1: if we gave length size of array is 5 and 
									we initialize index value as 5/more than length size 
									of array it gives runtime error called  as 
									"ArrayIndexOutofBoundException"  */
								
			
			
			//Array usage
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		
		
		
			String[] ar1=new String[5];
		
			ar1[0]="ABCD";
			
			ar1[2]="MNOP";
			
			ar1[4]="XYZ";
			
								 /*Example 2:if we dont initialize value to any index,it 
								  * shows result value as "null" */
								  
			for(int i=0;i<=ar.length-1;i++)
			{
				System.out.println(ar1[i]);
			}
	}
	
}