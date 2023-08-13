package Programmers.lev2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 뒤에있는큰수찾기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{9, 1, 5, 3, 6, 2})));

    }


    public static int[] solution(int[] numbers) {

        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < numbers.length; i++) {
            while (!s.isEmpty() && numbers[s.peek()] < numbers[i]) {
                numbers[s.pop()] = numbers[i];
            }
            s.push(i);
        }
        while (!s.isEmpty()) {
            numbers[s.pop()] = -1;
        }
        return numbers;




//        Queue<Integer> q = new LinkedList<>();
//        for (int i = 0; i < numbers.length - 1; i++) {
//            int k = numbers[i];
//            int m = numbers[i + 1];
//
//            if (k < m) {
//                numbers[i] = m;
//            } else {
//                q.add(i);
//            }
//
//            int size = q.size();
//                System.out.print(size);
//            for (int j = 0; j < size; j++) {
//                int idx = q.poll();
//                if (numbers[idx] < m) {
//                    numbers[idx] = m;
//                } else {
//                    q.add(idx);
//                }
//            }
//        }
//        q.add(numbers.length - 1);
//        while (!q.isEmpty()) {
//            int idx = q.poll();
//            numbers[idx] = -1;
//
//        }
//
//        return numbers;
    }
}
