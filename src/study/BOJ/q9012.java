package study.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class q9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            char[] S = br.readLine().toCharArray();
            Stack<Character> stack = new Stack();

            for (int j = 0; j < S.length; j++) {
                char c = S[j];
                if (S[j] == '(') {
                    stack.push('(');
                } else {
                    if (stack.empty()) {
                        stack.push(')');
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (stack.empty())
                System.out.println("YES");
             else
                System.out.println("NO");
        }
    }
}
