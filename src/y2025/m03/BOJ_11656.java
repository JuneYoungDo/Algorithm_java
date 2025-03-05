package y2025.m03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader((System.in)));
        StringBuilder sb = new StringBuilder();
        String input = bf.readLine();

        String[] strArr = new String[input.length()];
        for (int i = 0; i < input.length(); i++) {
            sb.setLength(0);
            sb.append(input);
            strArr[i] = sb.delete(0, i).toString();
        }
        Arrays.sort(strArr);
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }
    }
}
