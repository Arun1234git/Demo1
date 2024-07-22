package loops;

public class For_pyramid 
{
	
	public static void main(String[] args) 
	{
		
		int row= 5;
		  int i=1;
		  int j;
		 
		 for(i=1;i<=row;i++)
		  {
		  for(j=1;j<=i;j++)
		  {
		  System.out.println(i*j+" ");
		  }
		  System.out.println("");
		 }
	
		 
		 for(int c=1;c<=row;c++)
		 {
		for(int d=1;d<=row-1;d++)
		{
			System.out.println("");
		}
		for(int k=1;k<=i*2-1;k++)
		{
			System.out.println("*");
		}
		System.out.println();
	}
	
	/*	int _row= 5;
		for(int m=1;i<=_row;m++)
		{
			for(int n=1; n<=m;m++)
			{
				System.out.println("*");
			}
			//for(int k=1;k<=i*2-1;k++)
			//{
				//System.out.println("*");
			//}
			System.out.println("  ");
		
		}*/
	}
	
}
		
		

