package Traning;

 class Abe {

	public  int EvenOdd(int Num)
	{
		int result;
		 if(Num%2==0) {
		result = Num; System.out.println("Even number"); } else { result = Num;
		 System.out.println("Odd Number"); }
		 
		return result;
		
	}
}
 class Bee extends Abe{
	public  int EvenOdd(int Num)
	{
		int result1;
		if(Num%2==0)
		{
			
			result1 = Num;
			System.out.println("Even number");
		}
		else
		{
			result1 = Num;
			System.out.println("Odd Number");
		}
		
		return result1;
		
	}
 }
public class Retrun_Method_overrriding{
	public static void main(String args[]) 
	{
		/*
		 * int n1= 115,evenodd; int n2=112,evenodd1;
		 * System.out.println("This Method is called Overloading"); evenodd=EvenOdd(n1);
		 * System.out.println("The Number is = " + evenodd); evenodd1=EvenOdd(n2);
		 * System.out.println("The Number is = " + evenodd1);
		 */
		Abe a= new Abe();
		a.EvenOdd(17);
		
		Bee b= new Bee();
		b.EvenOdd(15);
		
		System.out.println("The Number is :-");
	}
 }
	
