package logical_programs;

import java.util.Arrays;

public class array_max_element 
{
public static void main(String[] args) 
{
  int [] ar= {25,82,90,30,60};
  
  System.out.println(" elements present in array");
  
 for(int i=0;i<=ar.length-1;i++)
  {
	  System.out.print(ar[i]+" ");
  }
  	System.out.println();
  Arrays.sort(ar);

 System.out.println("maximum element in array is : "+ar[ar.length-1]);

}
}

