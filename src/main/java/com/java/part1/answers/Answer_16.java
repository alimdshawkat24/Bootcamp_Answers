package com.java.part1.answers;

public class Answer_16 {

	//Write a Java program to check if a given string is a palindrome or not.
	
	public static void main(String[] args) {
		
		String s = "radar";
		
		int start = 0;
		int end = s.length()-1;
		
		boolean isPalindrome= true;
		
		while(start<end) {
			if(s.charAt(start)!=s.charAt(end)) {
				isPalindrome = false;
				break;
			} 
			
			start++;
			end--;
		}
		
		if(isPalindrome) {
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not a Palindrome");
		}
		
		
	}

}
