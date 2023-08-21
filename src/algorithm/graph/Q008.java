package algorithm.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 백준 실버 1
 * 1325) 효율적으로 해킹하기
 * time : 8768ms
 * memory : 304180KB
 * review : 230821
 */
public class Q008 {
    static boolean[] visited;
    static int[] cnt;
    static ArrayList<Integer>[] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        A = new ArrayList[n + 1];
        cnt = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            A[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()); // 컴퓨터
            int b = Integer.parseInt(st.nextToken()); // 신뢰하는 컴퓨터
            A[a].add(b);
        }
        for (int i = 1; i <= n; i++) {
            visited = new boolean[n + 1];
            BFS(i);
        }
        int maxItem = -1;
        for (int i = 1; i <= n; i++) {
            maxItem = Math.max(maxItem, cnt[i]);
        }
        for (int i = 1; i <= n; i++) {
            if (cnt[i] == maxItem) {
                System.out.print(i + " ");
            }
        }
    }

    private static void BFS(int item) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(item);
        visited[item] = true;
        while (!q.isEmpty()) {
            int pollItem = q.poll();
            for (int i : A[pollItem]) {
                if (!visited[i]) {
                    visited[i] = true;
                    cnt[i]++;
                    q.offer(i);
                }
            }
        }

    }
}
