package method;

public class sample3 
{
	public static void main(String[] args) 
	{
		
		
		System.out.println("main method started from here");
		sample3 s3=new sample3();//non static regular method call from same class
		s3.m3(); 
		
				
		sample4 s4=new sample4();//non static regular method call from diff class
		  s4.m4();
		
		
		
	}  
	public void m3()
	{
		System.out.println("\nregular non static method m3 started");
		System.out.println("regular non static method m3 ended");
	}
}
