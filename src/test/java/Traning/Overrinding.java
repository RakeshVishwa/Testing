 package Traning;
 class A{
	 public String a;
 public int rakesh() { 
	 return 4;
  }
  public void meth2() { 
	  System.out.println("I am Method 2 of Class A"); 
	  }

 } class B extends A {
  
  @Override 
  public void meth2() {
  System.out.println("I am Method 2 of Class B"); 
  } 
  public void meth3() {
  System.out.println("I am Method 3 of Class B"); 
  } 
  }

 public class Overrinding {
  
  public static void main(String args[]) { 
	  A a= new A(); 
	  a.meth2();
	  B b=new B();
	  b.meth3();
	  b.meth2(); 
	  a.rakesh(); 
 }
  }
 

