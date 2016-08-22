package com.sikuli;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class techgig14 {
public static void main(String[] args) {
	
	Scanner scanner= new Scanner(System.in);
	String text[] = new String[10];
	for(int i=0;i<10;i++){
		text[i]=scanner.next();
	}
	Arrays.sort(text);
	for(int i=0;i<10;i++){
		System.out.println(text[i]);
	}
}
}
