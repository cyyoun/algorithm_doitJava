package Programmers.lev2;

import java.util.*;
import java.util.stream.Collectors;

public class 복습1 {
    public static void main(String[] args) {
        System.out.println("solution1 = " + solution1(new int[]{2,6,8,14}));
        System.out.println("solution2 = " + solution2(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
        System.out.println("solution3 = " + solution3("{(["));

    }

    static int solution1(int[] arr) {
        int answer = LCM(arr[0], arr[1]);
        for (int i = 2; i < arr.length; i++) {
            answer = LCM(answer, arr[i]);
        }
        return answer;
    } //N개의 최소공배수
    static int LCM(int a, int b) { //최소공배수
        int div = GCD(a, b);
        return a * b / div ;
    }
    static int GCD(int a, int b) { //최대공약수
        int remainder = 1;
        while (remainder != 0) {
            remainder = b % a;
            b = a;
            a = remainder;
        }
        return b;
    }
    static int solution2(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();
        int answer = 0;
        for (int i : tangerine) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Integer> list = map.values().stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        for (int i : list) {
            k -= i;
            answer++;
            if (k <= 0) {
                break;
            }
        }
        return answer;
    } //귤 고르기
    static int solution3(String s) { //괄호 회전하기
        Map<Character, Character> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        map.put(']', '[');
        map.put(')', '(');
        map.put('}', '{');
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            s = s.substring(1) + s.substring(0, 1);
            if (extracted(s, map, stack)) {
                answer++;
            }
        }
        return answer;
    }

    private static boolean extracted(String s, Map<Character, Character> map, Stack<Character> stack) {
        for (char c : s.toCharArray()) {
            if (c == ']' || c == ')' || c == '}') {
                if (stack.isEmpty() || stack.pop() != map.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else  {
            return false;
        }
    }
}
