package com.sikuli;

import java.util.Scanner;

public class techgig12 {
public static void main(String[] args) {
	 int m, n, c, d,k,l;
     Scanner in = new Scanner(System.in);

  //   System.out.println("Enter the number of rows and columns of matrix");
     m = in.nextInt();
     n  = in.nextInt();
         
     int first[][] = new int[m][n];
    
     int sum[][] = new int[m][n];

   //  System.out.println("Enter the elements of first matrix");

     for (  c = 0 ; c < m ; c++ )
        for ( d = 0 ; d < n ; d++ )
           first[c][d] = in.nextInt();

  //   System.out.println("Enter the elements of second matrix");
     k = in.nextInt();
     l = in.nextInt();
     int second[][] = new int[k][l];
     for ( c = 0 ; c < k ; c++ )
        for ( d = 0 ; d < l ; d++ )
           second[c][d] = in.nextInt();

     for ( c = 0 ; c < m ; c++ )
        for ( d = 0 ; d < n ; d++ )
            sum[c][d] = first[c][d] + second[c][d];  //replace '+' with '-' to subtract matrices

    // System.out.println("Sum of entered matrices:-");

     for ( c = 0 ; c < m ; c++ )
     {
        for ( d = 0 ; d < n ; d++ )
           System.out.print(sum[c][d]+" ");
        	System.out.print("\n");
     }
  }
}
