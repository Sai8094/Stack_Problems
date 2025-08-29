package com.stack;

public class PostfixEvaluation {

    public static void main(String[] args) {
        String string = "231*+9-";   
        System.out.println(evaluatePostfix(string)); 
    }

    static Integer evaluatePostfix(String string) {
        
    	MainStack<Integer> stack = new MainStack<>();

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);

            if (Character.isDigit(ch)) {
                stack.push(ch - '0');  
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                switch (ch) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand1 - operand2);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        if (operand2 == 0) {
                            System.out.println("Division by zero");
                        }
                        stack.push(operand1 / operand2);
                        break;
                    case '^':
                        stack.push((int) Math.pow(operand1, operand2));
                        break;
                    default:
                        System.out.println("Invalid operator: " + ch);
                }
            }
        }
        return stack.pop();
    }
}
