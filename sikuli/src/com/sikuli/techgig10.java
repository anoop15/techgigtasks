package com.sikuli;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class techgig10 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int count=scanner.nextInt();
		int[] list = new int[count];
		for(int j=0;j<count;j++)
			list[j] =  scanner.nextInt();
		
		Arrays.sort(list);
		System.out.println(list[count-2]);
	}
}