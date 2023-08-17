package programmers.lev2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class 배달 {
    public static void main(String[] args) {
        System.out.println(solution(5, new int[][]{{1, 2, 1}, {2, 3, 3}, {5, 2, 2}, {1, 4, 2}, {5, 3, 1}, {5, 4, 2}}, 3));
    }

    static int solution(int n, int[][] road, int k) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Map>[] A = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            A[i] = new ArrayList<>();
        }
        for (int[] i : road) {
            int start = i[0], end = i[1], weight = i[2];
            map.put(end, Math.min(weight, map.getOrDefault(end, 2000)));
            A[start].add(map);
//            A[end].add(r);
        }


        return answer;
    }
}
