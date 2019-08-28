package com.program.logical;

import java.util.Stack;

public class BalancedParenthensies {

	public static boolean checkParenthensies(String str) {

		Stack<Character> obj = new Stack<Character>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '[' || ch == '(' || ch == '{') {
				obj.push(ch);
			} else if (ch == ']') {
				if (obj.isEmpty() || obj.pop() != '[') {
					return false;
				}

			} else if (ch == '}') {
				if (obj.isEmpty() || obj.pop() != '{') {
					return false;
				}

			} else if (ch == ')') {
				if (obj.isEmpty() || obj.pop() != '(') {
					return false;
				}

			}
		}

		return obj.isEmpty();

	}

	public static void main(String[] args) {

		System.out.println(checkParenthensies("{[(xxx,yyy)]}"));
		System.out.println(checkParenthensies("{)(acd,bcvfs}"));
		System.out.println(checkParenthensies("{(xxx},yyy)"));
		System.out.println(checkParenthensies("[(xxx),yyy]"));
	}
}