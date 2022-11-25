package org.selenium;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = s.nextInt();
		
		int number,rem,result=0;
		
		number=num;
		
		while(number!=0) {
			
			rem=number%10;
			result=result+(rem*rem*rem);
			number=number/10;
		}
		if(num==result) {
			System.out.println(num+"is an armstrong number");
		}
		else {
			System.out.println(num+"is not an armstrong number");
		}
	}

}
