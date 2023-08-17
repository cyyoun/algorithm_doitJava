package programmers.lev2;

import java.util.Stack;

public class 괄호회전하기 {
    public static void main(String[] args) {
        System.out.println(solution("}]()[{"));
    }

    public static int solution(String s) {
        int answer = validString(s);
        for (int i = 1; i < s.length(); i++) {
            s = s.substring(1) + s.charAt(0);
            if (validString(s) == 1) {
                answer++;
            }
        }
        return answer;
    }

    static int validString(String str) {
        Stack<Character> stack = new Stack<>();
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    flag = true;
                    break;
                }
                switch (c) {
                    case ')':
                        if (stack.pop() != '(')
                            flag = true;
                        break;
                    case ']':
                        if (stack.pop() != '[')
                            flag = true;
                        break;
                    default:
                        if (stack.pop() != '{')
                            flag = true;
                        break;
                }
            }
        }
        if (flag || !stack.isEmpty()) {
            flag = true;
        }
        return flag ? 0 : 1;
    }
}
