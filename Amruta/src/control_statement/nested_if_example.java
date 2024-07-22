package control_statement;

public class nested_if_example {
	
	public static void main(String[] args) {
		
		/*int PEM=398;
			
	if(PEM>=300)
	{
		System.out.println("Eligible for main Exam");
		int MEM=700;
		if(MEM>=800)
		{
			System.out.println("GOT SELECTED");
		}
		
	}*/
	
	
		int PEM=875;
	
			if(PEM>=300)
				{
					System.out.println("Eligible for main Exam");
					int MEM=700;
					
					if(MEM>=800)
					{
						System.out.println("GOT SELECTED");
						
					}
					else
					{
						System.out.println("rejected from main exam");
					}
				}
			else
			
			{
				System.out.println("not eligible for main exam");
			}
	
				
	}
}
		