package com.java.part1.answers;
	
	public class Answer_04 {
		
	    public static void main(String[] args) {
	    	
			//Write a program to implement a stack using a linked list in Java.
	    	
	    	Answer_04 stack = new Answer_04();
	        stack.push(1);
	        stack.push(2);
	        stack.push(3);

	        System.out.println("Stack elements:");
	        stack.display();

	        System.out.println("Popped element: " + stack.pop());

	        System.out.println("Peeked element: " + stack.peek());

	        System.out.println("Updated stack elements:");
	        stack.display();
	    }
	    
	    private static class Node {
	        int data;
	        Node next;

	        public Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    private Node top;

	    public Answer_04() {
	        this.top = null;
	    }

	    public boolean isEmpty() {
	        return top == null;
	    }

	    public void push(int data) {
	        Node newNode = new Node(data);
	        newNode.next = top;
	        top = newNode;
	    }

	    public int pop() {
	        if (isEmpty()) {
	            throw new IllegalStateException("Stack is empty. Cannot pop from an empty stack.");
	        }
	        int poppedValue = top.data;
	        top = top.next;
	        return poppedValue;
	    }

	    public int peek() {
	        if (isEmpty()) {
	            throw new IllegalStateException("Stack is empty. Cannot peek into an empty stack.");
	        }
	        return top.data;
	    }

	    public void display() {
	        Node current = top;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }
	}


