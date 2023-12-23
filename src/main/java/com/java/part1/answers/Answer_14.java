package com.java.part1.answers;

public class Answer_14 {
	
	//Write a Java program to find the factorial of a number using recursion.
		
	static int number = 7;
	static int result = 0;	
	
	
		public static void main(String[] args) {
			result = factorial(number);
			System.out.println("The factorial of "+ number + " is: " + result);
	}
		
		public static int factorial(int n) {
			if(n==0 || n==1) {
				return 1;
			} else {
				result = n * factorial(n-1);
				return result;
			}
		}
}

