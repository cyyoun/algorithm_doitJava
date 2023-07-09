package Programmers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 같은숫자는싫어 {
    public static void main(String[] args) {
        solution(new int[]{1,2,3,4,5,6,7,8,9});
    }

    private static int[] solution(int []arr) {

        int k = -1;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if (k != arr[i]) {
                queue.add(arr[i]);
                k = arr[i];
            }
        }
        int size = queue.size();
        int[] answer = new int[size];
        for (int i = 0; i < size; i++) {
            answer[i] = queue.poll();
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
