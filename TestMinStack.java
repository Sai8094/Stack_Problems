package com.stack;

public class TestMinStack {

	public static void main(String[] args) {
		
		MinStack mainStack = new MinStack();
	
		mainStack.push(34);
		mainStack.push(38);
		mainStack.push(12);
		mainStack.push(67);
		mainStack.push(5);
		mainStack.push(17);
		
		System.out.println(mainStack.pop());
		System.out.println(mainStack.getMin());

	}

}
