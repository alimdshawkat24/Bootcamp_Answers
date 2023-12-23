package com.java.part1.answers;

import java.util.Scanner;

public class Answer_34 {
	
	//Write a Java program to implement a simple calculator.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		float firstNumber = sc.nextFloat();
		sc.nextLine();
		System.out.println("Enter the second number: ");
		float secondNumber = sc.nextFloat();
		sc.nextLine();
		float result = 0;
		
		System.out.println("Enter mathematical operator: ");
		char operator = sc.nextLine().charAt(0); 
		
		if(operator == '+') {
			result = firstNumber + secondNumber;
			System.out.println(result);
		} else if(operator == '-') {
			result = firstNumber - secondNumber;
			System.out.println(result);
		}else if(operator == '*') {
			result = firstNumber * secondNumber;
			System.out.println(result);
		}else if(operator == '/') {
			result = firstNumber / secondNumber;
			System.out.println(result);
		}else {
			System.out.println("Invalid Operator");
		}
		
		sc.close();
		

	}

}
