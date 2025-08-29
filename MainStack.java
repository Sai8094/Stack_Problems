package com.stack;

import com.linkedlist.Node;

public class MainStack<T extends Comparable<T>> {

	private Node<T> top;
	private Node<T> next;
	private int size;

	public MainStack() {
		this.top = null;
		this.size = 0;
	}

	public void push(T element) {
		Node<T> newNode = new Node<T>(element);
		newNode.next = top;
		top = newNode;
		size++;
	}

	public T pop() {
		if (isEmpty()) {
			System.out.println("Stack Underflow!");
			return null;
		}
		T popped = top.data;
		top = top.next;
		size--;
		return popped;
	}

	public T peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty!");
			return null;
		}
		return top.data;
	}

	public boolean isEmpty() {
		return top == null;
	}

	public int size() {
		return size;
	}

	public void display() {
	    Node temp = top;
	    while(temp != null) {
	        System.out.println(temp.data +" ");
	        temp = temp.next;
	    }
	}

}
