package com.dkte;
import java.util.Scanner;
public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print(" enter number");
		int num=sc.nextInt();
		System.out.println(" given number"  +num);
		//integer--->binary
		String binary=Integer.toBinaryString(num);
		////integer--->octa
		String octal=Integer.toOctalString(num);
		//integer--->hexal
		String hexa = Integer.toHexString(num);
		System.out.println("Binary Equivalent:" +binary);
		System.out.println("Octal Equivalent:" +octal);
		System.out.println("hexa Equivalent:" +hexa);
		
		
		

	}

}
