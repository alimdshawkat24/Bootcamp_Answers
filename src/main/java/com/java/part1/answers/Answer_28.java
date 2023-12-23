package com.java.part1.answers;

import java.util.Scanner;

public class Answer_28 {
	
	//Write a Java program to find the sum of two numbers.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter First number: ");
		
		int firstNumber = sc.nextInt();
		
		System.out.println("Enter Second number: ");
		
		int secondNumber = sc.nextInt();
		
		
		int addition = firstNumber + secondNumber;
		
		System.out.println("The addition of the two numbers is: " + addition);
		
		sc.close();

	}

}
