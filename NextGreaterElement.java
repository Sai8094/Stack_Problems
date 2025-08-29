package com.stack;

import java.util.ArrayList;
import java.util.List;

public class NextGreaterElement {

	static List<Integer> findNextGreaterElement(List<Integer> inputList) {

		ArrayList<Integer> result = new ArrayList<>(inputList.size());
		MainStack<Integer> stack = new MainStack<>();

		for (int i = 0; i < inputList.size(); i++) {
			result.add(-1);
		}

		for (int i = inputList.size() - 1; i >= 0; i--) {

			while (!stack.isEmpty() && stack.peek() <= inputList.get(i)) {
				stack.pop();
			}
			if (!stack.isEmpty()) {
				result.set(i, stack.peek());
			}
			stack.push(inputList.get(i));
		}

		return result;
	}

	public static void main(String[] args) {
		ArrayList<Integer> input = new ArrayList<>();
		input.add(4);
		input.add(5);
		input.add(2);
		input.add(25);

		List<Integer> output = findNextGreaterElement(input);
		System.out.println(output);
	}
}
