package useofstaicandnonstatic;

public class useof_static {
	


		
		int rno;
		String name;
		static String dept="IT";		//static variable
		
		
		useof_static(int n1,String s1)
		{
		rno=n1;
		name=s1;						//assigning local variable values to global variable 
	
		}
		public static void main(String[] args) 
		{
			
			System.out.println("stuent info");
			useof_static u1=new useof_static(11,"amruta");
			u1.stud();
			
			useof_static u2=new useof_static(12,"raghav");
			u2.stud();
			
			useof_static u3=new useof_static(13,"kiran");
			u3.stud();		
				
				
			
		}
		public void stud() 
		{
			System.out.println(rno+" : "+" :"+name+" : "+dept);
		
		}
	}


