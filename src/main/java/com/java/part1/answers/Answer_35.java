package com.java.part1.answers;

import java.util.Scanner;

public class Answer_35 {
	
	//Write a Java program to convert Fahrenheit to Celsius.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Farenheit: ");
		float farenheit = sc.nextFloat();
		//sc.nextLine();
		
		float celcius = (farenheit-32.0f)*(5.0f/9.0f);
		
		System.out.println("It is" + celcius + "degree celcius.");
		

	}

}
