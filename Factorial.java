package com.dkte;

public class Factorial {

	public class Leap_Year {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		int fac=1;
		for(int i=0;i<num;i++)
		{
			fac=fac*(num-i);
			
		}
		System.out.println(num+" factorial is "+fac);

	}

}
