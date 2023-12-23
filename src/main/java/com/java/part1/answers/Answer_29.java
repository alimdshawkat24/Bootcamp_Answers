package com.java.part1.answers;

import java.util.Scanner;

public class Answer_29 {
	
	//Write a Java program to find the average of three numbers.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int a = scanner.nextInt();
		System.out.println("Enter second number: ");
		int b = scanner.nextInt();
		System.out.println("Enter third number: ");
		int c = scanner.nextInt();
		
		int average = (a+b+c)/3;
		
		System.out.println("The average is: " + average);
		
		scanner.close();

	}

}
