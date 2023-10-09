package programmers.lev2;

import java.util.HashMap;
import java.util.Map;

public class 영어끝말잇기 {
        public int[] solution(int n, String[] words) {

            Map<String, Integer> map = new HashMap<>();
            map.put(words[0], 1);

            for (int i = 1; i < words.length; i++) {
                String s = words[i];
                if (words[i - 1].charAt(words[i - 1].length() - 1) == s.charAt(0)) {
                    map.put(s, map.getOrDefault(s, 0) + 1);

                    if (map.get(s) > 1) {
                        return calc(i + 1, n);
                    }
                } else {
                    return calc(i + 1, n);
                }
            }
            return new int[]{0, 0};
        }



        static int[] calc(int a, int b) {
            int cnt = 0, remainder = 0;

            if (a % b == 0) {
                cnt = a / b; remainder = b;
            } else {
                cnt = (a / b) + 1; remainder = a % b;
            }
            return new int[] {remainder, cnt};
        }
    }

