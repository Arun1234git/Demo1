package logical_programs;



public class Add_table 
{
public static void main(String[] args) 
{
	int num=5;
	int sum=0;
	for(int i=1;i<=10;i++)
	{
		int table=i*num;
	
		System.out.println(table);
		sum=sum+table;
		/*int sum=0;
		/*System.out.println(sum);
		
		int temp=sum+sum;
		System.out.println(temp);
		
		System.out.println(num*i);
		//System.out.println(num+sum);
		for(sum=num*i;sum<=50;sum=sum+5)
			
		{
			System.out.println(sum);
		}*/
	}
	System.out.println(sum);	
}
}