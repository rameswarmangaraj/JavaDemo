package com.ds;

import java.util.Stack;

public class EvaluatePostFixByStack {

    public static void main(String[] args) {
        String str = "23*54*+9-";
        int result = evalutePostFix(str);
        System.out.println(result);
    }

    private static int evalutePostFix(String str) {
        char[] arr = str.toCharArray();
        Stack<Integer> st = new Stack<>();
        for (Character c : arr) {
            if (Character.isDigit(c)) {
                st.push(c-'0');
            } else {
                int b=st.pop();
                int a=st.pop();
                int r=0;
                switch(c){
                    case '+': r=a+b; break;
                    case '-': r=a-b; break;
                    case '*': r=a*b; break;
                    case '/': r=a/b; break;
                }
                st.push(r);
            }
        }
        return st.peek();
    }

}