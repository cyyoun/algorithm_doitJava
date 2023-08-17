package programmers.lev1_2;

import java.util.Arrays;

public class 바탕화면정리 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"..........", ".....#....", "......##..", "...##.....", "....#....."})));



    }
    private static int[] solution(String[] wallpaper) {
        int[] answer = {50, 50, 0, 0};

        for (int i = 0; i < wallpaper.length; i++) {
            char[] line = wallpaper[i].toCharArray();
            for (int j = 0; j < line.length; j++) {
                if (line[j] == '#') {
                    answer[0] = Math.min(answer[0], i);
                    answer[1] = Math.min(answer[1], j);
                    answer[2] = Math.max(answer[2], i + 1);
                    answer[3] = Math.max(answer[3], j + 1);
                }
            }
        }


        return answer;
    }
}
