package com.java.part1.answers;

public class Answer_21 {

	public static void main(String[] args) {
		
		//Write a Java program to implement insertion sort algorithm.
		
		int arr[] = {5,6,2,3,1};
		
		for(int i=1; i<arr.length; i++) {
			int key = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		
		for(int i = 0; i<=arr.length-1; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
