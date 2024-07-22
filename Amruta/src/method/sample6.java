package method;

public class sample6 {

	public void cube(int num1)
	{
		System.out.println(num1*num1*num1);
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println("student information");
		info("Raghav","Pawar");
		studinfo(1,"Raghav",92.8f,'A');
		studinfo(2,"kiran",85f,'a');
		studinfo(3,"Amruta",68f,'B');
		
	}
		
	public static void studinfo(int id,String name,float per,char grade)
	{
		
		System.out.println("student id is"+" "+id);
		System.out.println("student name is"+" "+name);
		System.out.println("student per"+" "+per);
		System.out.println("student grade is"+" "+grade);
	}
	
	public static void info(String FN,String LN)
	{
		System.out.println(FN+" "+LN);
	}

}
