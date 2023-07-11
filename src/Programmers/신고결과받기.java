package Programmers;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

public class 신고결과받기 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        System.out.println(list.indexOf("dd"));

        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;
        System.out.println(Arrays.toString(solution(id_list, report, k)));
    }
    private static int[] solution(String[] id_list, String[] report, int k) {
        List<String> list = Arrays.stream(report).distinct().collect(Collectors.toList());
        HashMap<String, Integer> count = new HashMap<>();
        for (String s : id_list) {
            String target = s.split(" ")[1];
            count.put(target, count.getOrDefault(target, 0) + 1);
        }

        return Arrays.stream(id_list).map(_user -> {
            final String user = _user;
            List<String> reportList = list.stream().filter(s ->
                    s.startsWith(user + " ")).collect(Collectors.toList());
            return reportList.stream().filter(s ->
                    count.getOrDefault(s.split(" ")[1], 0) >= k).count();
        }).mapToInt(Long::intValue).toArray();

    }
}
