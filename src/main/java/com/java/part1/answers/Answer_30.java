package com.java.part1.answers;

import java.util.Scanner;

public class Answer_30 {
	
	//Write a Java program to check if a given number is even or odd.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		
		if(number%2==0) {
			System.out.println("This is an even number.");
		}
		else {
			System.out.println("This is an odd number.");
		}
		
		sc.close();

	}

}
