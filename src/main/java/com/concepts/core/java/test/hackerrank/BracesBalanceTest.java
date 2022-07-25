package com.concepts.core.java.test.hackerrank;

import java.util.Stack;

class Parser {

	public boolean isBalanced(String expression) {

		Stack<Character> openBrackets = new Stack<Character>();
		
		char[] chrArr = new char[0];
		if(expression != null && expression.length() > 0) {
			chrArr = expression.toCharArray();
		}

		for (Character ch : chrArr) {
			if (isOpen(ch)) {
				openBrackets.push(ch);
			} else if (openBrackets.isEmpty()) {
				return false;
			} else {
				Character open = openBrackets.pop();
				if (!isPair(open, ch)) {
					return false;
				}
			}
		}

		// If we have more open brackets than closed brackets
		if (openBrackets.size() > 0) {
			return false;
		}
		return true;
	}

	private static boolean isOpen(Character c) {
		return c != null && (c.equals('(') || c.equals('[') || c.equals('{'));
	}

	private static boolean isPair(Character open, Character close) {
		if (open == null || close == null) {
			return false;
		} else if (open.equals('(') && close.equals(')')) {
			return true;
		} else if (open.equals('[') && close.equals(']')) {
			return true;
		} else if (open.equals('{') && close.equals('}')) {
			return true;
		} else {
			return false;
		}
	}

}

public class BracesBalanceTest {
	public static void main(String[] args) {

		String[] expArr = { "{}()", "{()}", "({()})" };
		String[] expArr2 = { "({()})" };
		String[] expArr1 = { "{}(", "({)}", "((", "}{", "({})" };

		Parser sol = new Parser();

		for (int i = 0; i < expArr.length; i++) {

			boolean answer = sol.isBalanced(expArr[i]);

			if (answer) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}
}