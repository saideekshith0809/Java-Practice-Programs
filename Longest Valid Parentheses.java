import java.io.*;
import java.util.*;
import java.util.Scanner;
public class LongestValidParentheses {

    public static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); 

        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(i);
            } else {
                stack.pop();

                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    int length = i - stack.peek();
                    maxLength = Math.max(maxLength, length);
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s1 = "(()";
        String s2 = ")()())";
        String s3 = "";

        System.out.println(longestValidParentheses(s1)); 
        System.out.println(longestValidParentheses(s2)); 
        System.out.println(longestValidParentheses(s3)); 
    }
}
