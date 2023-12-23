package com.java.part1.answers;

public class Answer_18 {
	
	//Write a Java program to find the second highest number in an array.

	public static void main(String[] args) {
		
		int arr[] = {4,7,5,3,9};
		int n = arr.length;
		
		int highest = 0;
		int secondHighest = 0;
		
		for(int i = 0; i<n; i++) {
			
			if(arr[i] > highest) {         
			secondHighest = highest;       
			}
		if(arr[i] <highest && arr[1] > secondHighest) {
			secondHighest = arr[i];        
		}
		}
		
		System.out.println(secondHighest);

	}

}
