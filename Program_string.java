package com.dkte;

public final class Program_string{
  	public static void main(String[] args) {
		//format(); 
		String str = "Sunbeam Karad"; 
		int year = 1998; 
		String s1 = String.format("%s was founded in year %d", str,year); 
		System.out.println(s1);
	}
  
	
	/*  
	public static void main(String[] args) {
		// String class in Java -- represents immutable "sequence of characters"
		// length() returns number of chars
		// charAt() returns char at given index -- 0 to length()-1
		// "str" reference is created on "stack"
		// "Sunbeam" string literal/constant is created on String pool (in heap)
		String str = "Sunbeam"; 
		System.out.println("Length : "+str.length());
		for(int i = 0 ; i < str.length() ; i++) {
			char ch = str.charAt(i); 
			System.out.print(ch);
		}

	}
	*/
	/*
	public static void main(String[] args) {
		//length(), charAt()(String is a class in java represents immutable "sequence of chars") 
		//new String objects are created on heap 
		String str = new String("Infotech"); 
		System.out.println("Length : "+str.length());
		for(int i = 0 ; i < str.length() ; i++) {
			char ch = str.charAt(i); 
			System.out.print(ch);
		}
	}*/ 
	/* 
	public static void main(String[] args) {
		String str = "Sunbeam Infotech"; 
		char ch = 'e';
		int idx = str.indexOf(ch); 
		System.out.println("char " + ch + " is at index " + idx);
		
		ch = 't'; 
		idx = str.indexOf(ch); 
		System.out.println("char " + ch + " is at index " + idx);
		
		ch = 't'; 
		idx = str.lastIndexOf(ch); 
		System.out.println("char " + ch + " is at index " + idx);
		
		ch = 'x'; 
		idx = str.lastIndexOf(ch); 
		System.out.println("char " + ch + " is at index " + idx);
	}*/ 
	/* 
	public static void main(String[] args) {
		//toUpperCase(), toLowerCase()(// strings are immutable.
	    // operations performed on string will create a new object with modified contents.
		String s1 = "Sunbeam"; 
		String s2 = s1.toUpperCase(); 
		System.out.println(s1);
		System.out.println(s2);
		String s3 = s1.toLowerCase(); 
		System.out.println(s3);
	}*/ 
	/* 
	public static void main(String[] args) {
		// concat()
		String s1 = "Sunbeam"; 
		String s2 = "Infotech"; 
		String str = s1.concat(s2); 
		System.out.println(str);
	}*/
	/* 
	public static void main(String[] args) {
		//Substring 
		String str = "Sunbeam Infotech"; 
		String s1 = str.substring(8); 
		System.out.println(s1);
		
		String s2 = str.substring(7, 11); 
		System.out.println(s2);
	}*/
	/* 
	public static void main(String[] args) {
		//split()
		String str = "this is just an example"; 
		String[] parts = str.split(" "); 
		for(String part : parts) {
			System.out.println(part);
		}
	}*/ 
	/* 
	public static void main(String[] args) {
		//trim() -- trim() removes leading and trailing spaces from the string
		String str = "               Sunbeam Infotech             "; 
		System.out.println("Length : "+str.length());
		String s1 = str.trim(); 
		System.out.println("Length : "+s1.length());
	}*/ 
	

	 

}




