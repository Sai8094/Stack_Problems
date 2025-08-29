package com.stack;

public class MinStack {
	MainStack<Integer> stack = new MainStack<>();
	Integer min;

	void push(Integer value) {
		if (stack.isEmpty()) {
			min = value;
			stack.push(value);
		} else if (value < min) {
			stack.push(2 * value - min);
			min = value;
		} else {
			stack.push(value);
		}
	}

	Integer pop() {
		if (stack.isEmpty())
			return null;

		Integer top = stack.pop();
		if (top < min) {
			Integer originalMin = min;
			min = 2 * min - top;
			return originalMin;
		}
		return top;
	}

	Integer top() {
		if (stack.isEmpty()) {
			System.out.println("Stack is Empty");
			return null;
		}

		Integer top = stack.peek();
		if (top < min) {
			return min;
		} else {
			return top;
		}

	}

	Integer getMin() {
		return min;
	}
	
}
