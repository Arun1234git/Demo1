package Abstract_concrit;

abstract public class Abstract_demo1				/*Abstract class means combination of 
														complete and incomplete methods*/
{
	public void add()							//method declaration
	{																	//complete method
		System.out.println("addition");			//method definition
	}

	public void sub() 							//method declaration

	{																		//complete method
		System.out.println("substraction");		//method definition
	}

	abstract public void mul();					/*method with declaration only and dont
												have definition::::incomplete method 	*/

																
	abstract public void div();	       /*method with declaration only and dont
												have definition::::incomplete method 	*/
abstract public void abc();
}
