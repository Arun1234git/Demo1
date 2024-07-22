package Array;

public class Array_2d_declare_initialize_single_stage 
{
		public static void main(String[] args) 
		{
				    //	    0   1  2
					// 0  10 20  30
					// 1  40 50  60
			
			int [][] ar= {{10,20,30},      {40,50,60}};
						//row index:0	//row index:1
			
		System.out.println(ar[1][2]);	
		System.out.println(ar.length);
		
		System.out.println("***********************");
		
		for(int i=0; i<=1;i++)				//outer for loop---> for rows
		{
			for(int j=0;j<=2;j++)			//inner for loop---->for rows
			{
				System.out.print(ar[i][j]+" ");
			}
		System.out.println();
		
		}
		
			
		}
}
