package com.ds;

import java.util.Stack;

public class InfixToPostFixStack {
    public static void main(String[] args) {
        String expr = "((A+B)*C-D)*E";
        String postExpr = convertInToPost(expr);
        System.out.println(postExpr);
    }

    private static String convertInToPost(String expr) {
        String pExpr = "";
        char[] arr = expr.toCharArray();
        Stack<Character> st = new Stack<>();
        for (Character ch : arr) {
            if (Character.isLetterOrDigit(ch)) {
                pExpr += ch;
            } else if(isOpeningParenthesis(ch)){
                st.push(ch);
            }
            else if(isOperator(ch)){
                while (!st.isEmpty() && isHigherPrecedence(st.peek(),ch)&& !isOpeningParenthesis(st.peek())) {
                    pExpr += st.peek();
                    st.pop();
                }
                st.push(ch);
            }else if(isClosingParenthesis(ch)){
                while (!st.isEmpty() &&  !isOpeningParenthesis(st.peek())) {
                    pExpr += st.peek();
                    st.pop();
                }
                st.pop();
            }

        }
        while(!st.isEmpty()){
            pExpr+=st.peek();
            st.pop();
        }
        return pExpr;
    }

    private static boolean isOperator(Character ch) {
        boolean isOprator=false;
        if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
            isOprator=true;
        }
        return isOprator;
    }

    private static boolean isClosingParenthesis(Character ch) {
        boolean isClose = false;
        if(ch==')'||ch=='}'||ch==']'){
            isClose=true;
        }
        return isClose;
    }

    private static boolean isOpeningParenthesis(Character ch) {
        boolean isOpen = false;
        if(ch=='('||ch=='{'||ch=='['){
            isOpen=true;
        }
        return isOpen;
    }

    private static boolean isHigherPrecedence(Character op1, Character op2) {
        boolean ishigher = false;
        int opW1 = getWeight(op1);
        int opW2 = getWeight(op2);
        if (opW1 >= opW2) {
            ishigher = true;
        }
        return ishigher;
    }

    private static int getWeight(Character op) {
        int weight = 0;
        switch (op) {
            case '+':
            case '-':
                weight = 1;
                break;
            case '*':
            case '/':
                weight = 2;
                break;
            default:
                weight = 0;
        }
        return weight;
    }

}