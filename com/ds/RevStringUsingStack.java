package com.ds;

import java.util.Stack;

public class RevStringUsingStack {
    public static void main(String[] args) {
        String str = "Hello World";
        // String rev = getReverseByStack(str);
        String rev=getReverse(str);
        System.out.println(rev);
    }

    private static String getReverse(String str) {
        StringBuffer sb = new StringBuffer();
        int i=0, j=str.length()-1;
        char[] arr = str.toCharArray();
        while(i!=j){
            char t=arr[j];
            arr[j]=arr[i];
            arr[i]=t;
            i++;
            j--;
        }
        sb.append(arr);
        return sb.toString();
    }

    private static String getReverseByStack(String str) {
        StringBuffer sb = new StringBuffer();
        Stack<Character> sk = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            sk.push(str.charAt(i));
        }
        while (!sk.isEmpty()) {
            sb.append(sk.peek());
            sk.pop();
        }
        return sb.toString();
    }
}