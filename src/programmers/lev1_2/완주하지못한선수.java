package programmers.lev1_2;

import java.util.HashMap;

public class 완주하지못한선수 {
    public static void main(String[] args) {
        String[] a = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] b = {"josipa", "filipa", "marina", "nikola"};
        System.out.println(solution(a, b));
    }

    private static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) {
            hm.put(player, hm.getOrDefault(player, 0) + 1);
        }
        for (String player : completion) {
            hm.put(player, hm.get(player) - 1);
        }
        for (String key : hm.keySet()) {
            if (hm.get(key) != 0) {
                answer = key;
            }
        }
        return answer;
    }

}
