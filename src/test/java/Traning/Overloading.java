package Traning;

public class Overloading {
	
	 public static void foo()
	{
		System.out.println("Good Morning !");
	}
	 static void foo(int a)
	{
		System.out.println("Good Morning " + a);
	}
	 static void foo(int a, int b)
	{
		System.out.println("Good Morning " +a+ " or " + b + " Bro");
	}
	
	public static void main(String[] args) {
		foo();
		foo(3000);
		foo(3000,4000);
	}

}
