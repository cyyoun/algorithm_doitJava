package algorithm.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 백준 실버 2
 * 2644) 촌수계산
 * time : 124ms
 * memory : 14208KB
 * review : 230826
 */

public class Q013 {
    static int x, y;
    static boolean[] visited;
    static int[] calc;
    static ArrayList<Integer>[] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(br.readLine());
        A = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        calc = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            A[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            A[a].add(b);
            A[b].add(a);
        }
        BFS(x);
        if (calc[y] == 0) {
            System.out.println(-1);
        } else {
            System.out.println(calc[y]);
        }
    }

    private static void BFS(int x) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(x);
        visited[x] = true;
        while (!q.isEmpty()) {
            Integer pollItem = q.poll();
            for (int i : A[pollItem]) {
                if (!visited[i]) {
                    visited[i] = true;
                    q.offer(i);
                    calc[i] = calc[pollItem] + 1;
                }
            }
        }
    }
}
