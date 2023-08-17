package programmers.lev1_2;

import java.util.ArrayList;
import java.util.Arrays;

public class 나누어떨어지는숫자배열 {
    public static void main(String[] args) {

        int[] A = solution(new int[]{2, 36, 1, 3}, 1);
        System.out.println(Arrays.toString(A));
    }


    private static int[] solution(int[] arr, int divisor) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i : arr) {
            if (i % divisor == 0) {
                list.add(i);
            }
        }
        int[] answer = {};
        if (list.size() != 0) {
            answer = list.stream().mapToInt(Integer::valueOf).sorted().toArray();
        } else {
            answer = new int[]{-1};
        }
        return answer;
    }
}
