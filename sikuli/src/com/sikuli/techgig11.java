package com.sikuli;

import java.util.Scanner;

public class techgig11 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String text=scanner.nextLine();
	int uppercase=0,lowercase=0;
    for(int i=0;i<text.length();i++)
    {
        int asciivalue = (int)text.charAt(i);
        if(asciivalue >=65 && asciivalue <=90){
            uppercase++;
        }
        else if(asciivalue >=97 && asciivalue <=122){
            lowercase++;
        }
    }
    
    System.out.println(uppercase);
    System.out.println(lowercase);
}
}

