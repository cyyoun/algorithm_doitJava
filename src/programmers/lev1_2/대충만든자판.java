package programmers.lev1_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 대충만든자판 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(
                new String[]{"ABCDE"},
                new String[]{"SSSD", "OOO", "XXXXO", "SSDEO", "DD", "FGHIJ", "MM"}
        )));
    }
    private static int[] solution(String[] keymap, String[] targets) {
        Map<Character, Integer> map = new HashMap<>();

        for (String s : keymap) {
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (map.containsKey(chars[i])) {
                    map.put(chars[i], Math.min(i + 1, map.get(chars[i])));
                } else {
                    map.put(chars[i], i + 1);
                }
            }
        }

        int[] answer = new int[targets.length];
        for (int i = 0; i < targets.length; i++) {
            for (char k : targets[i].toCharArray()) {
                if(map.containsKey(k)) {
                    answer[i] += map.get(k);
                } else {
                    answer[i] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}
