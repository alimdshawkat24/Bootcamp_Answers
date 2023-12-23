package com.java.part1.answers;

import java.util.Scanner;

public class Answer_31 {
	
	//Write a Java program to check if a given number is prime or not.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		int count = 0;
		
		for(int i = 1; i<=number; i++) {
			if(number % i ==0) {
				count++;
			}
		}
		
		if(count>2) {
			System.out.println("This is not a prime number");
		}
		else {
			System.out.println("This is a prime number");
		}
		
		sc.close();
	}

}
