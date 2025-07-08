package com.dkte;
import java.util.Scanner;
class Fraction implements Comparable{
	int n;
	int d;
	//constructors
	Fraction(){
		//to do
	}
	public Fraction(int n, int d) {
		super();
		this.n = n;
		this.d = d;
	}
	//value
	public int value()
	{
		return n/d;
	}
	@Override
	public int compareTo(Object o) {
		Fraction other = (Fraction) o; 
		if(this.value() == other.value())
			return 0; 
		if(this.value() > other.value()) 
			return 1; 
		else 
			return -1; 
	}
		
	
}

public class Program {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st fraction values :");
        int n1 = sc.nextInt();
        int d1 = sc.nextInt();
        Fraction f1 = new Fraction(n1, d1);

        System.out.println("Enter 2nd fraction values :");
        int n2 = sc.nextInt();
        int d2 = sc.nextInt();
        Fraction f2 = new Fraction(n2, d2);

		int result=f1.compareTo(f2);
		System.out.println("result:"+result);

		
		
	}

}
