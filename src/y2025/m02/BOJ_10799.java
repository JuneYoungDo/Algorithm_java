package y2025.m02;

import java.util.Scanner;
import java.util.Stack;

public class BOJ_10799 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='(') {
                stack.push(s.charAt(i));
            } else {
                stack.pop();
                if(s.charAt(i-1) == '(') {
                    answer += stack.size();
                } else {
                    answer += 1;
                }
            }
        }

        System.out.println(answer);
    }
}
