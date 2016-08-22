package com.sikuli;

	import java.util.Scanner;

public class techgig6 {

	public static void main(String[] args) {
		int i,number,count=0;
		Scanner scanner =new Scanner(System.in);
		number= scanner.nextInt();
		while(number>0){
			int rem;
			rem=number%10;
			count++;
			number=number/10;
		}
		System.out.println(count);
	}
}
