package Programmers.lev1_2;

import java.util.Arrays;

public class 영어끝말잇기 {
    public static void main(String[] args) {
        System.out.println((int)Math.ceil((double) 9 /3));
        System.out.println(Arrays.toString(solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"})));
    }


    // Set 을 사용해서 전체 사이즈 카운트하여 중복 확인 로직도 가능
    private static int[] solution(int n, String[] words) {
        int seq = 0;
        int person = 0;
        boolean flag = false;
        for (int i = 1; i < words.length; i++) {
            String str = words[i];
            String preStr = words[i - 1];

            for (int j = i - 1; j >= 0; j--) {
                if (str.equals(words[j])) {
                    flag = true;
                    break;
                }
            }
            if (!preStr.endsWith(str.substring(0, 1))) {
                flag = true;
            }
            if (flag) {
                person = (i + 1) % n == 0 ? n : (i + 1) % n;
                seq = (int)Math.ceil((double)(i + 1) / n);
                break;
            }
        }
        return new int[]{person, seq};
    }
}
