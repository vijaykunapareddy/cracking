package com.stacks;

import java.util.Stack;

public class ValidParenthisis {

	public static void main(String[] args) {
		boolean k = isValid("[]{");
		System.out.println(k);
	}
	
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c == '('){
				System.out.println(""+c);
				stack.push(')');
			}else if (c == '{'){
				System.out.println(""+c);
				stack.push('}');
			}else if (c == '['){
				System.out.println(""+c);
				stack.push(']');
			}else if (stack.isEmpty() || stack.pop() != c){
				System.out.println("c:"+c);
					return false;
			}
			System.out.println(stack.size());
		}
		
		return stack.isEmpty();
	}

}
