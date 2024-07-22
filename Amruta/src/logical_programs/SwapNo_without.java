package logical_programs;

public class SwapNo_without 
{
	public static void main(String[] args) 
	{
		int a=40;
		int b=50;
		System.out.println("numbers before swapping");
		System.out.println("1st number is :"+a);
		System.out.println("2nd number is :"+b);
			
		a=a+b; 					// a=40+50  a=90
		b=a-b;					// b=90-50  b=40
		a=a-b;					// a=90-40  c=50
		
		System.out.println("numbers after swapping");
		System.out.println("1st number is :"+a);
		System.out.println("2nd number is :"+b);
		
		
		

	}
}
