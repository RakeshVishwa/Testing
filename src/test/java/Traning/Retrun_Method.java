package Traning;

public class Retrun_Method {

	
 
public static int EvenOdd(int Num)
{
	int result;
	if(Num%2==0)
	{
		
		result = Num;
		System.out.println("Even number");
	}
	else
	{
		result = Num;
		System.out.println("Odd Number");
	}
	
	return result;
	
}

public static String EvenOdd(String Num1)
{
	String result1;
	if(Num1.length()%2==0)
	{
		
		result1 = Num1;
		System.out.println("Even number");
	}
	else
	{
		result1 = Num1;
		System.out.println("Odd Number");
	}
	
	return result1;
	
}
public static void main(String[] args) 
{
	int n1= 115,evenodd;
	String n2="Ravi",evenodd1;
	System.out.println("This Method is called Overloading");
	evenodd=EvenOdd(n1);
	System.out.println("The Number is = " + evenodd);
	evenodd1=EvenOdd(n2);
	System.out.println("The Number is = " + evenodd1);	
}
}
