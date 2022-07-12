package com.concepts.core.java.test.hackerrank;

import java.util.Stack;

public class BracesBalanceTest {

	public static boolean isBalanced(String expression) {

		Stack<Character> openBrackets = new Stack<Character>();

		for (Character c : expression.toCharArray()) {
			if (isOpen(c)) {
				openBrackets.push(c);
			} else if (openBrackets.isEmpty()) {
				return false;
			} else {
				Character open = openBrackets.pop();

				if (!isPair(open, c)) {
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

	public static void main(String[] args) {

		String[] expArr = { "{}()", "{()}", "({()})" };
		String[] expArr1 = {"{}(", "({)}", "((", "}{", "({})"};

		for (int i = 0; i < expArr1.length; i++) {

			boolean answer = isBalanced(expArr1[i]);

			if (answer)
				System.out.println("YES");
			else
				System.out.println("NO");
		}

	}
}