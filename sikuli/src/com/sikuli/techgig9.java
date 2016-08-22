package com.sikuli;

import java.util.Scanner;

public class techgig9 {

	public static void main(String[] args) {
		
		test t= new test();
		 Integer num1, temp, sum = 0;
		 Scanner scanner= new Scanner(System.in);
		 num1=scanner.nextInt();
		 temp = num1;
		 
	     while(temp > 0){
	    	 sum += power(temp%10,num1.toString().length());
	    	 temp=temp/10;
	     }
		
	     System.out.println(sum);
	     if(sum.equals(num1))
	     	System.out.println("True");
	     else
	    	 System.out.println("False");
	}
	
	static int power(int c, int d)
	{
	     int pow = 1;
	     int count = 1;
	     while(count <= d)
	     {
	          pow = pow*c;
	          count++;
	     }
	     return pow;
	}
	
}
