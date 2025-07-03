//narrowing & widening 
package com.dkte;

public class Narrow_widening {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=11;
		short s=b;//widening
		System.out.println("s:"+s);
		///////////////////
		short x=20;
		byte z=(byte)x;//narrowing----type casting needed
		System.out.println("z:" +z);

	}

}
