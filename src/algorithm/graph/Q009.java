package algorithm.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 백준 골드 5
 * 2251) 물의 양 구하기
 * time :
 * memory :
 * review : 230824(fail)
 */
public class Q009 {
    //특정 무게의 상태를 한 개의 노드로 가정하고
    //변경할 수 있는 이후의 무게 상태가 에지로 이어진 인접한 노드라고 생각하고 문제 해결
    static int[] Sender = {0, 0, 1, 1, 2, 2};
    static int[] Receiver = {1, 2, 0, 2, 0, 1};
    static boolean[][] visited;
    static int[] bucket; // A, B, C 물통
    static boolean[] answer;

    public static void main(String[] args) throws IOException {
        Set<Integer> set = new HashSet<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        bucket = new int[3];
        bucket[0] = Integer.parseInt(st.nextToken());
        bucket[1] = Integer.parseInt(st.nextToken());
        bucket[2] = Integer.parseInt(st.nextToken());
        visited = new boolean[201][201];
        answer = new boolean[201];

        BFS();
        for (int i = 0; i < answer.length; i++) {
            if (answer[i]) System.out.print(i + " ");
        }
    }
    private static void BFS() {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0});
        visited[0][0] = true;
        answer[bucket[2]] = true;
        while (!q.isEmpty()) {
            int[] pollItem = q.poll();
            int A = pollItem[0];
            int B = pollItem[1];
            int C = bucket[2] - A - B;
            for (int i = 0; i < 6; i++) {
                int[] next = {A, B, C};
                next[Receiver[i]] += next[Sender[i]];
                next[Sender[i]] = 0;
                if (next[Receiver[i]] > bucket[Receiver[i]]) {
                    next[Sender[i]] = next[Receiver[i]] - bucket[Receiver[i]];
                    next[Receiver[i]] = bucket[Receiver[i]];
                }
                if (!visited[next[0]][next[1]]) {
                    visited[next[0]][next[1]] = true;
                    q.add(new int[]{next[0], next[1]});
                    if (next[0] == 0) {
                        answer[next[2]] = true;
                    }
                }
            }
        }

    }
}
