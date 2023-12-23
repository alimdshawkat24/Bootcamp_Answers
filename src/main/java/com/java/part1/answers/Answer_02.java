package com.java.part1.answers;

public class Answer_02 {

    private static class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    public Answer_02() {
        this.head = null;
        this.tail = null;
    }

    // Add a node to the end of the doubly-linked list
    public void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Display the elements of the doubly-linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
    	Answer_02 doublyLinkedList = new Answer_02();

        // Append nodes to the doubly-linked list
        doublyLinkedList.append(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);

        // Display the doubly-linked list
        System.out.println("Doubly-linked list elements:");
        doublyLinkedList.display();
    }
}