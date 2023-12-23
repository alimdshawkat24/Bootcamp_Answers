package com.java.part1.answers;

public class Answer_19 {

	public static void main(String[] args) {
		
		//Write a Java program to implement bubble sort algorithm.
		
		int numbers[] = {6,5,2,8,9,4};
		int size = numbers.length;
		int temp = 0;
		
		
		for(int i = 0; i<size; i++) {
			for(int j = 0; j<size-i-1; j++) {
				if(numbers[j]>numbers[j+1]) {
					temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1]= temp;
				}
			}
		}
		
		for(int i = 0; i<=size-1; i++) {
			System.out.print(numbers[i] + " ");
		}
		

	}

}
