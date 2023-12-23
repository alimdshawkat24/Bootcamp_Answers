package com.java.part1.answers;

public class Answer_23 {
	
	//Write a Java program to count the number of words in a given string.

	public static void main(String[] args) {
		
		String s = "Welcome to Eclipse!";
		int counter = 1;
		
		for(int i = 0; i<=s.length()-1; i++) 
		{
			
			if((s.charAt(i)==' ') && s.charAt(i+1)!=' ')
			{
				counter++;
			}
			
		}
		
		System.out.println("The number of words in the given string is: "+counter);

	}

}
