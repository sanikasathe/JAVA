package com.sunbeam;

import java.util.Scanner;

public class Program {

	public static void main1(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the number : ");
		int num = sc.nextInt(); 
		System.out.println("square : "+num * num);

	}
	public static void main2(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the number : ");
		int num = sc.nextInt(); 
		System.out.println("square : "+num * num);
		sc.close();

	}
	public static void main3(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the number : ");
		int num = sc.nextInt(); 
		System.out.println("square : "+num * num);
		sc.close();
		System.out.println("Resource closed");

	}
	public static void main4(String[] args) {
		Scanner sc = new Scanner(System.in); 
		try{
			System.out.println("Enter the number : ");
			int num = sc.nextInt(); 
			System.out.println("square : "+num * num);
			
		}
		finally {
			sc.close();
			System.out.println("Resource closed");
		}
		
	}
	public static void main5(String[] args) {
		// try with resource --- java 7.0 
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter the number : ");
			int num = sc.nextInt(); 
			System.out.println("square : "+num * num);
		}//sc.close(); 
	}
	public static void main(String[] args) {
		//custom resource class 
		class MyResource implements AutoCloseable {
			
			public MyResource() {
				System.out.println("MyResource created..");
			}
			@Override
			public void close() {
				System.out.println("Resource closed..");
			}
			
		}
		try(MyResource myResource = new MyResource() ){
			System.out.println("My Resource..");
		}//myResource.close(); 
	}

}

















