package algorithm.Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 백준 실버 3
 * 17413) 단어 뒤집기 2
 * time : 1052ms
 * memory : 30420KB
 * review : 230824(fail) 230825
 */
public class Q010 {
    static Stack<Character> stack;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        stack = new Stack<>();
        boolean chk = false;

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '<') {
                print();
                chk = true;
                System.out.print(line.charAt(i));
            } else if (line.charAt(i) == '>') {
                chk = false;
                System.out.print(line.charAt(i));
            } else if (chk) {
                System.out.print(line.charAt(i));
            }
            else {
                if (line.charAt(i) == ' ') {
                    print();
                    System.out.print(line.charAt(i));
                } else {
                    stack.push(line.charAt(i));
                }
            }

        }
        print();
    }

    private static void print() {
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
