package com.java.part1.answers;

import java.util.Random;

public class Answer_36 {
	
	//Write a Java program to generate a random number between 1 and 100.

	public static void main(String[] args) {
		
        Random random = new Random();
        int randomNumber = random.nextInt(99) + 1;
        System.out.println("Random Number between 1 and 100: " + randomNumber);
	}
}
