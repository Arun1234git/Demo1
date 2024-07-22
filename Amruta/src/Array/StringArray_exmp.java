package Array;

public class StringArray_exmp 
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
				
			//Array usage
			System.out.println(ar[0]);	
			System.out.println(ar[1]);
			
			System.out.println(ar.length);
			
	System.out.println("print all data at a time");		
	
			for(int i=1;i<=ar.length-1;i++) 
			{
				System.out.println(ar[i]);
			}
				
			
	
			
			
}
}
