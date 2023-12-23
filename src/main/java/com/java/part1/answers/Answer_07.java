package com.java.part1.answers;

public class Answer_07 {

    public static void main(String[] args) {
    	
    	//Write a program to find the maximum subarray sum in an array of integers in Java.
    	
        int[] nums = {-2, -3, 4, -1, -2, 1, 5, -3};

        int maxSubarraySum = findMaxSubarraySum(nums);

        System.out.println("Maximum Subarray Sum: " + maxSubarraySum);
    }

    private static int findMaxSubarraySum(int[] nums) {
        int maxEndingHere = nums[0];
        int maxSoFar = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }
}