package inheritance;

public class This_super1 extends This_super
{
  int a=40;
  
  public void sample2()
  {
	  System.out.println(this.a);
	  System.out.println(super.a);
  }
  
  public static void main(String[] args)     
  {
	  This_super1 t2=new This_super1();
	  t2.sample2();
	  t2.sample();
	
  }
}
