package algorithm.Review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q010_review1 {
    static Stack<Character> stack;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        boolean chk = false;
        stack = new Stack<>();

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (c == '<') {
                reverseStr();
                System.out.print(c);
                chk = true;
            } else if (c == '>') {
                System.out.print(c);
                chk = false;
            } else {
                if (chk)  System.out.print(c);
                else {
                    if (c == ' ') {
                        reverseStr();
                        System.out.print(c);
                    } else {
                    stack.push(c);
                    }
                }
            }
        }
        if (!stack.isEmpty()) {
            reverseStr();
        }
    }

    private static void reverseStr() {
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
