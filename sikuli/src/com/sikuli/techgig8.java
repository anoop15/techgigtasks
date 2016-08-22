package com.sikuli;

import java.util.Scanner;

public class techgig8 {

	public static void main(String[] args) {
		int c=0,a,temp;  
		Scanner scanner= new Scanner(System.in);
		int num=scanner.nextInt();
	    temp=num;  
	    while(num>0)  
	    {  
	    a=num%10;  
	    num=num/10;  
	    c=c+(a*a*a*a);  
	    }  
	    if(temp==c)  
	    System.out.println("True");   
	    else  
	        System.out.println("false");   
	   }  
	static double power(double c, double d)
	{
	     double pow = 1;
	     int count = 1;
	     while(count <= d)
	     {
	          pow = pow*c;
	          count++;
	     }
	     return pow;
	}
	
}
