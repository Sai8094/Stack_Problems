package com.stack;

public class BalancedParenthesis {

	public static void main(String[] args) {
		
		System.out.println(isBalanced("()"));

	}
	
	static boolean isBalanced(String string)
	{
		MainStack<Character> stack = new MainStack<>();
		
		for(int i=0;i<string.length();i++)
		{
			Character pushCharacter = string.charAt(i);
			if(pushCharacter == '(' || pushCharacter == '[' || pushCharacter == '{') {
				stack.push(pushCharacter);
			}else {
				if(stack.isEmpty())
					return false;
			}
			Character popCharacter = stack.peek();
			stack.pop();
			if(pushCharacter == '('&& popCharacter != ')' || pushCharacter == '[' && popCharacter != ']' 
					||pushCharacter == '{' && popCharacter != '}' )
				return true;
				
		}
		return stack.isEmpty();
	}
}
