package control_statement;

public class else_if_exapmle {

	
	public static void main(String[] args)
	{
		
		int marks=78;
		
		if(marks>=70)
		{
			System.out.println("distinction");
			
		}
		else if(marks<=69 & marks>=65)
		
		{
			System.out.println("first class");
			
		}
		else if(marks<=64 & marks>=60)
		{
			System.out.println("second class");
		}
		
		else if(marks>=35)
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
		}
	}
}