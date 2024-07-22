package useofstaicandnonstatic;

public class Use_of_nonstatic {
	
	int emp_id;           //non static variable
	String emp_name;
	String desi;
	
	Use_of_nonstatic(int n1,String s1,String s2)
	{
		emp_id=n1;
		emp_name=s1;			//assigning local variable values to global variable 
		desi=s2;
		
	}
	
	public void emp_info()
	{
		System.out.println(emp_id+":"+emp_name+":"+desi);
	}
	

	public static void main(String[] args) 
	{
		Use_of_nonstatic e1=new Use_of_nonstatic(10,"amruta","tester");
		e1.emp_info();
		Use_of_nonstatic e2=new Use_of_nonstatic(11,"ruta","ester");
		e2.emp_info();
		Use_of_nonstatic e3=new Use_of_nonstatic(12,"amrut","test ");
		e3.emp_info();
		                    
		
		
	}
}
