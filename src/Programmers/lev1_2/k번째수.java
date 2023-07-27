package Programmers.lev1_2;

import java.util.Arrays;

public class k번째수 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}})));
    }

    private static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int l = 0; l < commands.length; l++) {
            int i = commands[l][0] - 1;
            int j = commands[l][1];
            int k = commands[l][2] - 1;
            int[] copyArr = Arrays.copyOfRange(array,i, j);
            Arrays.sort(copyArr);
            answer[l] = copyArr[k];

        }
        return answer;
    }
}
