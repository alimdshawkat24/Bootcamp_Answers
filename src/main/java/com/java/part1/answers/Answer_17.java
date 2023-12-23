package com.java.part1.answers;

public class Answer_17 {
	
	//Write a Java program to reverse a given string without using any built-in functions.

	public static void main(String[] args) {
		String str = "Hello World!";
		String rstr = "";
		char ch;
		
		for(int i = 0; i<str.length(); i++) {
			ch = str.charAt(i);
			rstr = ch + rstr;
		}
		System.out.println("Reverse String =" + rstr);

	}

}
