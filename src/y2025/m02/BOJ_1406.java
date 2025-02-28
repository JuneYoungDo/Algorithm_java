package y2025.m02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        int num = Integer.parseInt(br.readLine());

        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            leftStack.push(s.charAt(i));
        }

        for (int i = 0; i < num; i++) {
            String command = br.readLine();
            if (command.equals("L")) {
                if (!leftStack.isEmpty()) {
                    rightStack.push(leftStack.pop());
                }
            } else if (command.equals("D")) {
                if (!rightStack.isEmpty()) {
                    leftStack.push(rightStack.pop());
                }
            } else if (command.equals("B")) {
                if (!leftStack.isEmpty()) {
                    leftStack.pop();
                }
            } else if (command.startsWith("P")) {
                leftStack.push(command.charAt(2));
            }
        }

        while (!leftStack.isEmpty()) {
            rightStack.push(leftStack.pop());
        }

        while (!rightStack.isEmpty()) {
            sb.append(rightStack.pop());
        }
        System.out.println(sb);
    }
}
