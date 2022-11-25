package org.selenium;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the Number");
			int n = s.nextInt();
			int f=1;
			for(int i=1;i<=n;i++) {
				f=f*i;
			}
			System.out.println(f);
		}
	}

}
