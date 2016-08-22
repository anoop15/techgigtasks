package com.sikuli;

public class StringFunctions {
public static void main(String[] args) {
	
	String st1 = "This World is Very Nice";
	  String st2 = " And Beautiful.";
	  
	  
	//System.out.println(st1.equals(st2));  
	//System.out.println(st1.concat(st2));
	System.out.println(st1.charAt(11));
	System.out.println(st1.length());
	System.out.println(st1.toLowerCase());
	System.out.println(st1.toUpperCase());
	System.out.println(st1.indexOf('W'));
	System.out.println(st1.indexOf(st2, 3));
	  System.out.println("Index of word Very Is -> "+st1.indexOf("Very"));
	  int i =90;
	  String val2= String.valueOf(i);
	  System.out.println(val2);
	  
	  
}
}
