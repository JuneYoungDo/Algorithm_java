package y2025.m02;

import java.util.Scanner;
import java.util.Stack;

public class BOJ_9012 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long testcase = Long.parseLong(sc.nextLine());
        for (int i = 0; i < testcase; i++) {
            boolean flag = true;
            Stack<Character> s = new Stack<>();
            String input = sc.nextLine();

            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == '(') {
                    s.push(input.charAt(j));
                } else {
                    if (s.isEmpty()) {
                        flag = false;
                        break;
                    }
                    s.pop();
                }
            }
            if (!flag || !s.isEmpty()) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

    }
}
