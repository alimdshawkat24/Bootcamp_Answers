package com.java.part1.answers;

public class Answer_15 {

	//Write a Java program to check if a given number is a palindrome or not.
	
	public static void main(String[] args) {
		
		int number = 123321;
		int reverse = 0;
		
		int org_number = number;
		
		while(number!=0) {
			reverse= reverse*10 + number%10;
			number = number/10;
		}
		
		if(org_number==reverse) {
			System.out.println("It is a Palindrome");
		} else {
		System.out.println("It is not a Palindrome");
		}
	}

}
