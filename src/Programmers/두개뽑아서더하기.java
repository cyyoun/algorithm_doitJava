package Programmers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 두개뽑아서더하기 {
    public static void main(String[] args) {
        int[] A = solution(new int[]{2, 1, 3, 4, 1});
        System.out.println(Arrays.toString(A));
    }

    private static int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }


        int[] answer = set.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
