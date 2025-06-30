package com.dkte;

public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// converting primitive to wrapper -> Boxing 
		int i = 10;
		Integer j = new Integer(i); // Boxing 
		Integer k = i; // auto-boxing (java 5.0) 
		
		//Converting wrapper to primitive -> Unboxing 
		Integer x = new Integer(10); 
		int y = x.intValue(); // Unboxing 
		int z = x; // auto-unboxing (java 5.0) 
		System.out.println("i:"+ i + "  j:"+ j + "  k:"+ k + "  x:"+x +"  y:"+ y +"  z:"+z);

	}

}
