package Traning;


class Hello {
	
	public static int First(int a, int b)
	{
		return a + b;
	}
	
	
}
class Bye {
	public int Minus(int a, int b)
	{
		return a - b;
	}
}

public class StaticandNonStatic {
	
	public static void main(String[] args) {
		
		int n=10, m=20, s;
		
		s= Hello.First(m, n);
		
		System.out.println("Sum is - " +s);
		
		Bye f=new Bye();
		
		int q = f.Minus(m, n);
		
		System.out.println("Minus is - "+q);
	}

}
