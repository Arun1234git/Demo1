package Abstract_concrit;

public class Concrit_demo1 extends Abstract_demo1
{

	public void squareofnum()
	{	
		int n=5;
		System.out.println("square of no 5 is "+n*n);
		
	}
	
	public void mul()
			
	{
		System.out.println("mul method running from concrit");
	}
	
	 public void div()
	 {
		 System.out.println("div method running from concrit");
	 }
	 
	 public static void main(String[] args) 
	 {
		System.out.println("concrit class running");
		Concrit_demo1 d1=new Concrit_demo1();
		d1.add();
		d1.sub();
		d1.mul();
		d1.div();
		d1.squareofnum();
	}
}
