package Programmers.lev2;

import java.util.Arrays;

public class 카펫 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(8, 1)));

    }
    private static int[] solution(int brown, int yellow) {
        int cnt = brown * yellow;

        int a = 1, b = 1;

        for (int i = 1; i <= Math.ceil(yellow / 2); i++) {
            if (yellow % i == 0) {
                a = i;
                b = yellow / i;
                if (a * 2 + b * 2 + 4 == brown) {
                    break;
                }
            }
        }
        int[] answer = new int[]{b + 2, a + 2};
        return answer;
    }

}
