package org.selenium;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
		}
		
		int n=10, firstTerm=0, secondTerm=1;
		System.out.println("Fibonacci Series of 10 terms");
		
		for(int i=1;i<=n;++i) {
			System.out.println(firstTerm + ",");
			
		
		int nextTerm = firstTerm + secondTerm;
		firstTerm =secondTerm;
		secondTerm=nextTerm;
		}
	}

}
