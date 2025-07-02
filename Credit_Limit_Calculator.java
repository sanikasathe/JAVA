package com.dkte;
import java.util.Scanner;
public class Credit_Limit_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the account number");
		int account_number=sc.nextInt();
		System.out.println("enter balance at the beginning of the month: $");
		int beginning_balance=sc.nextInt();
	    System.out.print("Enter total of all items charged this month: $");
	        int charges = sc.nextInt();

	        System.out.print("Enter total of all credits:");
	        int credits = sc.nextInt();

	        System.out.print("Enter allowed credit limit: $");
	        int creditLimit = sc.nextInt();

	        int new_Balance = beginning_balance + charges - credits;
	        if(new_Balance >creditLimit) {
	            System.out.println("Credit limit exceeded");
	        }
	   
	}

}
