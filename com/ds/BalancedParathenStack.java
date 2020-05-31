package com.ds;

import java.util.Stack;

public class BalancedParathenStack {

    public static void main(String[] args) {
        String expr = "([)]";
        boolean res = isBalanced(expr);
        System.out.println(res);
    }

    private static boolean isBalanced(String expr) {
        boolean isBalanced = false;
        Stack<Character> st = new Stack<>();
        char[] arr = expr.toCharArray();
        for (char c : arr) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (st.isEmpty() || !getPair(c, st.peek())) {
                    return false;
                } else {
                    st.pop();
                }
            }
        }
        isBalanced = st.isEmpty() ? true : false;
        return isBalanced;
    }

    private static boolean getPair(char c, char tc) {
        boolean isPair = false;

        if (c == ')' && tc == '(') {
            isPair = true;
        }
        if (c == '}' && tc == '{') {
            isPair = true;
        }
        if (c == ']' && tc == '[') {
            isPair = true;
        }
        return isPair;
    }

}