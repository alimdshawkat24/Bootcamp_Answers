package com.java.part1.answers;

public class Answer_01 {

	public static void main(String[] args) {
		
		//Write a program to implement a binary search tree in Java.
		
		BinaryTree tree = new BinaryTree();
		tree.insert(8);
		tree.insert(7);
		tree.insert(12);
		tree.insert(15);
		tree.insert(2);
		tree.insert(5);
		
		tree.inorder();

	}

}
