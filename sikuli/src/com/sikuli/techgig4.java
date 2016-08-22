package com.sikuli;

import java.util.Scanner;

public class techgig4 {
	public static void main(String[] args) {

		int age;
		Scanner scanner = new Scanner(System.in);
		age = scanner.nextInt();
		if(age<10){
			System.out.println("I am happy as having no responsibilities.");
		}
		if(age>=10 && age<18){
			System.out.println("I am still happy but start feeling pressure of life.");
		}
		if(age>=18){
			System.out.println("I am very much happy as i handled the pressure very well.");;
		}
	}
}
