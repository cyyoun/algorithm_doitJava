package programmers.lev2;

import java.util.Stack;

public class 올바른관ㄹ호 {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push('(');
            } else {
                if (stack.size() == 0) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.size() > 0) {
            return false;
        }

        return true;
    }
}
