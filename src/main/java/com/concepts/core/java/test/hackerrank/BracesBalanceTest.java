package com.concepts.core.java.test.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class Parser {

	public List<String> isBalanced(List<String> expressionArr) {
		List<String> strList = new ArrayList<>();
		for (String expression : expressionArr) {
			char[] chrArr = new char[0];
			if (expression != null && expression.length() > 0) {
				chrArr = expression.toCharArray();
			}
			boolean flag = isStringBalanced(chrArr);
			strList.add(flag ? "YES" : "NO");
		}
		return strList;
	}

	private static boolean isStringBalanced(char[] chrArr) {
		Stack<Character> openBrackets = new Stack<Character>();
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
		String[] expArr1 = { "{}(", "({)}", "((", "}{", "({})" };
		String[] expArr2 = { "({()})", "({)}" };
		String[] expArr3 = { "{}(]" };
		String[] expArr4 = { "[{}]", "[{]}" };

		Parser sol = new Parser();
		List<String> resList = new ArrayList<>();
		List<String> bracesList = Arrays.asList(expArr2);
		resList = sol.isBalanced(bracesList);
		System.out.println(resList);
	}
}