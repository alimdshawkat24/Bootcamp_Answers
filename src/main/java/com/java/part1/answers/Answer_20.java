package com.java.part1.answers;

public class Answer_20 {

	public static void main(String[] args) {
		
		//Write a Java program to implement selection sort algorithm.
		
		int numbers[] = {6,5,2,8,9,4};
		int size = numbers.length;
		int temp = 0;
		int minIndex = -1;
		
		for(int i = 0; i<size-1; i++) {
			minIndex=i;
			for(int j = i+1; j<size; j++) {
				if(numbers[minIndex] > numbers[j]) {
					minIndex = j;
				}
			}
			temp = numbers[minIndex];
			numbers[minIndex] = numbers[i];
			numbers[i] = temp;
		}

		
		for(int i = 0; i<=size-1; i++) {
			System.out.print(numbers[i] + " ");
		}

	}

}
