package com.sikuli;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class techgig7 {
	public static void main(String[] args) {
		int i,start, end, count=0;
		boolean isPrime = false; 
		Scanner scanner = new Scanner(System.in);
		start=scanner.nextInt();
		end=scanner.nextInt();
		 scanner.close();
	    //    List<Integer> primes = new ArrayList<>();
		for(i=start;i<end ;i++)
		{
			if(i==1)
			isPrime=false;
			else
				isPrime = true;
			for(int j=2;j<i;j++){
				if(i%j==0){
					isPrime=false;
					break;
				}
			}
			if(isPrime){
				count++;
				//primes.add(i);
			}
		}
		System.out.println(count);
		//System.out.println(primes.size());
		
	}
}
