package com.java.part1.answers;

	import java.util.Stack;

	public class Answer_05 {

	    private Stack<Integer> stack1;
	    private Stack<Integer> stack2;

	    public Answer_05() {
	        this.stack1 = new Stack<>();
	        this.stack2 = new Stack<>();
	    }

	    public void enqueue(int data) {
	        stack1.push(data);
	    }

	    public int dequeue() {
	        if (isEmpty()) {
	            throw new IllegalStateException("Queue is empty. Cannot dequeue from an empty queue.");
	        }

	        if (stack2.isEmpty()) {
	            while (!stack1.isEmpty()) {
	                stack2.push(stack1.pop());
	            }
	        }

	        return stack2.pop();
	    }

	    public boolean isEmpty() {
	        return stack1.isEmpty() && stack2.isEmpty();
	    }

	    public void display() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty.");
	            return;
	        }

	        System.out.print("Queue elements: ");
	        for (int element : stack2) {
	            System.out.print(element + " ");
	        }

	        for (int i = stack1.size() - 1; i >= 0; i--) {
	            System.out.print(stack1.get(i) + " ");
	        }

	        System.out.println();
	    }

	    public static void main(String[] args) {
	    	Answer_05 queue = new Answer_05();

	        queue.enqueue(1);
	        queue.enqueue(2);
	        queue.enqueue(3);

	        queue.display();
	        System.out.println("Dequeued element: " + queue.dequeue());
	        queue.display();
	    }

}
