package programmers.lev1_2;

import java.util.Stack;

public class 짝지어제거하기 {
    public static void main(String[] args) {
        System.out.println(solution("cdcd"));
    }
    private static int solution(String s){
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (stack.size() == 0) {
                stack.push(c);
            }
            else if (stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return  stack.size() > 0 ? 0 : 1;
    }
}
