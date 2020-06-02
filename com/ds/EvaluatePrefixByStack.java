package com.ds;
import java.util.Stack;
public class EvaluatePrefixByStack {
   
    public static void main(String[] args) {
        String str = "-+*23*549";
        int result = evalutePreFix(str);
        System.out.println(result);
    }

    private static int evalutePreFix(String str) {
        char[] arr = str.toCharArray();
        Stack<Integer> st = new Stack<>();
        for (int i = arr.length-1; i >=0; i--) {
            if (Character.isDigit(arr[i])) {
                st.push(arr[i]-'0');
            } else {
                int a=st.pop();
                int b=st.pop();
                int r=0;
                switch(arr[i]){
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