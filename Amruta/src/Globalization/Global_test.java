package Globalization;

public class Global_test 

{
	public static void main(String[] args) 
	{
		System.out.println("*****Features of Jio sim card****");
		Jio j=new Jio();
		j.audiocall();
		j.data();
		j.sms();
		j.feature_A();
		
		System.out.println("*****Features of Airtel sim card****");
		Airtel a=new Airtel();
		a.audiocall();
		a.data();
		a.sms();
		a.feature_B();
		
		System.out.println("*****Features of VI sim card****");
		Vi v=new Vi();
		v.audiocall();
		v.data();
		v.sms();
		v.feature_c();
	}
}
