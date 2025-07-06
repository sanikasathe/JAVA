package com.sunbeam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	
public static int divide(int num, int den) throws Exception {
			int res = num / den; // divide operator may throw Arithmetic Exception
			return res;
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			try {
				System.out.print("Enter the numerator : ");
				int num = sc.nextInt();
				System.out.print("Enter the denominator : ");
				int den = sc.nextInt();
				int result = divide(num, den);
				System.out.println("Res : " + result);
			} catch (Exception e) {
				System.out.println("Invalid I/P ");
			} 

		}
}
