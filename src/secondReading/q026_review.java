package secondReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class q026_review {
    static ArrayList<Integer>[] A;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //정점 개수
        int m = Integer.parseInt(st.nextToken()); //간선 개수
        int v = Integer.parseInt(st.nextToken()); //정점 시작 번호

        A = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            A[i] = new ArrayList<>();
        }
        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            A[a].add(b);
            A[b].add(a);
        }
        DFS(v);
        System.out.println();
        visited = new boolean[m + 1];
        BFS(v);

    }
    static void DFS(int v) {
        System.out.print(v + " ");
        visited[v] = true;
        for (int i : A[v]) {
            if (!visited[i]) {
                visited[i] = true;
                DFS(i);
            }
        }
    }

    static void BFS(int v) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(v);
        visited[v] = true;
        while (!q.isEmpty()) {
            int pollItem = q.poll();
            System.out.print(pollItem + " ");
            for (int item : A[pollItem]) {
                if (!visited[item]) {
                    visited[item] = true;
                    q.offer(item);
                }
            }
        }
    }
}
