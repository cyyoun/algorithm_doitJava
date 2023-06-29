package secondReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class q026_1260 {
    static boolean[] visited;
    static ArrayList<Integer>[] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 정점 개수
        int m = Integer.parseInt(st.nextToken()); // 간선 개수
        int v = Integer.parseInt(st.nextToken()); // 시작 정점


        A = new ArrayList[n + 1];

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

        for (int i = 1; i <= n; i++) {
            Collections.sort(A[i]);
        }

        visited = new boolean[n + 1];
        visited[v] = true;
        System.out.print(v + " ");
        DFS(v);

        System.out.println();
        System.out.print(v + " ");
        visited = new boolean[n + 1];
        BFS(v);
    }
    private static void DFS(int item) {
        for (int i : A[item]) {
            if (!visited[i]) {
                visited[i] = true;
                System.out.print(i + " ");
                DFS(i);
            }
        }
    }

    private static void BFS(int item) {
        visited[item] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(item);
        while (!queue.isEmpty()) {
            int pollItem = queue.poll();
            for (int i : A[pollItem]) {
                if (!visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }
}
