package com.dkte;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the string");
		String Original_String=sc.nextLine();
		StringBuilder sb1 = new StringBuilder(Original_String); 
		String rev_str = sb1.reverse().toString(); 
		System.out.println("original string "+ Original_String);
		System.out.println("reversed string "+ rev_str);
		
		
		

		

	}

}
