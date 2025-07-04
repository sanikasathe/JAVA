package com.dkte;
class A{
	public void showrecord()
	{
		System.out.println("A.showrecord");
	}
	public void printrecord()
	{
		System.out.println("A.printrecord");
	}
}
class B extends A{
	public void printrecord()
	{
		System.out.println("B.printrecord");
	}
	public void displayrecord()
	{
		System.out.println("B.displayrecord");
	}
}
public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ref=new B();//UPCASTING
		//ref.printrecord();
		//ref.showrecord();//dynamic memory dispatch--->calling subclass method on superclass ref
		//ref.displayrecord();//error
		B b = (B) ref; // Downcasting
        b.printrecord(); // Output: B.printrecord
        b.displayrecord(); // Output: B.displayrecord
        b.showrecord(); // Output: A.showrecord
		
		
		

	}

}
