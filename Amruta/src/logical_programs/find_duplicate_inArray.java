package logical_programs;

public class find_duplicate_inArray 
{
	public static void main(String[] args) 
	{
		int[] ar= {1,2,3,4,3 ,5,8,9,8};
		
		for(int i=0;i<=ar.length-1;i++)
		{
			for(int j=i+1;j<=ar.length-1;j++) 
			{
				if(ar[i]==ar[j])
				{
					System.out.println("duplicate number is : "+ar[j]);
				}
			}
		}
			
	}
}
