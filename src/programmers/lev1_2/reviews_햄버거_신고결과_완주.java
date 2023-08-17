package programmers.lev1_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class reviews_햄버거_신고결과_완주 {
    public static void main(String[] args) {
        int[] sin = singo(new String[]{"muzi", "frodo", "apeach", "neo"},
                new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"}, 2);
        System.out.println("singo = " + Arrays.toString(sin)); //2,1,1,0

        int ham = hamburger(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1});
        System.out.println("ham = " + ham); //2

        String player1 = failFinish(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},
                new String[]{"josipa", "filipa", "marina", "nikola"});
        System.out.println("player = " + player1); //vinko

        String player2 = failFinish(new String[]{"mislav", "stanko", "mislav", "ana"},
                new String[]{"stanko", "ana", "mislav"});
        System.out.println("player2 = " + player2); //mislav


    }

    private static int[] singo(String[] id_list, String[] report, int k) {
        List<String> list = Arrays.stream(report).distinct().collect(Collectors.toList());
        Map<String, Integer> map = new HashMap<>();
        for (String s : list) {
            String str = s.split(" ")[1];
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        return Arrays.stream(id_list).map(_user -> {
            String user = _user;
            List<String> reportList = list.stream().filter(s ->
                    s.startsWith(user + " ")).collect(Collectors.toList());
            return reportList.stream().filter(s ->
                    map.getOrDefault(s.split(" ")[1], 0) >= k).count();
        }).mapToInt(Long::intValue).toArray();
    }

    private static int hamburger(int[] ingredient) {
        int[] stack = new int[ingredient.length];
        int sp = 0;
        int answer = 0;

        for (int i :  ingredient) {
            stack[sp++] = i;
//            System.out.println("Arrays.toString(stack) = " + Arrays.toString(stack));
            if (sp >= 4 && stack[sp - 1] == 1 &&
                    stack[sp - 2] == 3 &&
                    stack[sp - 3] == 2 &&
                    stack[sp - 4] == 1) {
                sp -= 4;
                answer++;
            }
        }
        return answer;
    }


    private static String failFinish(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        String player = "";

        for (String s : participant) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (String s : completion) {
            map.put(s, map.getOrDefault(s, 0) - 1);
        }
        for (String s : map.keySet()) {
            if (map.get(s) != 0) {
                player = s;
                break;
            }
        }

        return player;
    }
}
