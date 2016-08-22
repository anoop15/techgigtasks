package com.sikuli;

import java.util.Scanner;

public class techgig3 {
	
    public static void main(String[] args) {
    	double principal,simpleinterest;
        int interest, year;
    
        Scanner scanner = new Scanner(System.in);
        principal= scanner.nextDouble();
    	interest=scanner.nextInt();
    	year=scanner.nextInt();
    	simpleinterest= (principal*interest*year)/100;
    	System.out.println((int) Math.ceil(simpleinterest));
     
    		
	}
}
