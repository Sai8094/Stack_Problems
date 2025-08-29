package com.stack;

public class StackSorting<T extends Comparable<T>> {

    void sortStack(MainStack<T> stack) {
        MainStack<T> temp = new MainStack<>();

        while (!stack.isEmpty()) {
            T current = stack.pop();
            
            while (!temp.isEmpty() && temp.peek().compareTo(current) < 0) {
                stack.push(temp.pop());
            }
            temp.push(current);
        }
        while (!temp.isEmpty()) {
            System.out.print(temp.peek()+ " ");
            temp.pop();
        }
    }
    
    public static void main(String[] args) {
		
    	MainStack<Integer> inputStack = new MainStack<Integer>();
    	inputStack.push(12);
    	inputStack.push(2);
    	inputStack.push(24);
    	inputStack.push(19);
    	inputStack.push(78);
    	inputStack.push(56);
    	
    	new StackSorting<Integer>().sortStack(inputStack);
    	
	}
}
