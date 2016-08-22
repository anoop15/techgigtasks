package com.sikuli;

public class techgig15 {
	public static void main(String[] args) {
		String a="sharm";
		String b="sharma";
		int c =a.compareTo(b);
		System.out.println(c);
		if(c<0)
			System.out.println(b+ " comes first");
		if(c==0)
			System.out.println(" two strings are lexicographically equivalent");
		if(c>0)
			System.out.println(a+ " comes first");
			
		
	}
}
