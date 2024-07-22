package logical_programs;

public class Prime 
{
		public static void main(String[] args) 
		
		{
		/*	int i,n;
			System.out.println("All prime numbers from 1 to 100");
			
			
			for(n= 1;n<=100;n++)
			{
				for(i=2;i<=n/2;i++)
				{
					if(n%i==0) 
						break;
				}
				if(i>n/2)
					System.out.println(n+"");
				
			}*/
			int number=31;
			int cc=0;
			
			//		i=1 1<=31
			for(int i=1;i<=number;i++) 
			{
				if(number%i==0)		//31%1==0
				{
					cc++;			//1
				}
			}
if(cc==2)
{
	System.out.println("number is prime");
}
else
{
	System.out.println("number is not prime");
}
		}

}