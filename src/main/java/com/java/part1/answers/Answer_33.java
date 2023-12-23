package com.java.part1.answers;

public class Answer_33 {

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
