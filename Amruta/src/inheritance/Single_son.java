package inheritance;

public class Single_son extends Single_level_father

{
	/*example of single level inheritance where son is sub/child class who access the 
	 property of super class father within same pkg	*/
	
	public void laptop()
	{
		System.out.println("laptop");
	}
	
	public static void main(String[] args) 
	{
		Single_son s1=new Single_son();
		s1.laptop();
		s1.home();
		s1.land();
		s1.money();
		
	}
}
