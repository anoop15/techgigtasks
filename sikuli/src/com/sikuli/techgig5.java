package com.sikuli;

import java.util.Scanner;

public class techgig5 {
public static void main(String[] args) {

	int number,fact=1,i;
	Scanner scanner = new Scanner(System.in);
	number = scanner.nextInt();
	for(i =1;i<=number;i++){
		fact=fact*i;
	}
	System.out.println(fact);
	
}
}
