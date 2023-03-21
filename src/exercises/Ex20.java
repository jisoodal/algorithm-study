package exercises;

import java.util.Stack;

public class Ex20 {
	
	/*
		 Ex20 Valid Parentheses

		 Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

		 An input string is valid if:

		 Open brackets must be closed by the same type of brackets.
		 Open brackets must be closed in the correct order.
		 Every close bracket has a corresponding open bracket of the same type.
	 */

	public static void main(String[] args) {
		System.out.println(isValid("]"));
	}

	public static boolean isValid(String s) {
		/**
		 * 여는 괄호면 stack에 적재,
		 * 닫는 괄호면 스택이 비었거나(적재된 것이 없다) 짝이 맞는 여는 괄호가 없으면 실패
		 */
		Stack<Character> stack = new Stack<>();

		for (char ch : s.toCharArray()) {
			switch (ch) {
				case '(':
				case '{':
				case '[':
					stack.push(ch);
					break;
				case ')': {
					if (stack.size() == 0 || stack.pop() != '(')
						return false;
					break;
				}
				case '}': {
					if (stack.size() == 0 || stack.pop() != '{')
						return false;
					break;
				}
				case ']': {
					if (stack.size() == 0 || stack.pop() != '[')
						return false;
					break;
				}
			}
		}

		return stack.isEmpty();
	}
}
