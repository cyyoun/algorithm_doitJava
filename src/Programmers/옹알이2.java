package Programmers;

import java.util.Arrays;

public class 옹알이2 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"}));
    }
    private static int solution(String[] babbling) {
        int answer = 0;

        for (String s : babbling) {
            if (s.contains("ayaaya") || s.contains("yeye") || s.contains("woowoo") || s.contains("mama")) {
                continue;
            }

            s = s.replace("aya", " ");
            s = s.replace("ye", " ");
            s = s.replace("woo", " ");
            s = s.replace("ma", " ");
            s = s.replace(" ", "");

            if (s.equals("")) {
                answer++;
            }
        }
        return answer;
    }
}
