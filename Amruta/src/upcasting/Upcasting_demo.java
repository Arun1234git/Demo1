package upcasting;

public class Upcasting_demo 
{
public static void main(String[] args)
{
	Father f1=new Son();
	f1.car();
	f1.home();
	f1.money();
	//f1.mobile();            method mobile is the property of class son,so superclass father
	//								cannot access that ..in upcasting
}
}
