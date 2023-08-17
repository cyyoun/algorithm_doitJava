package algorithm.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

/**
 * 백준 실버 2
 * 1260) DFS와 BFS 프로그램
 * time : 460ms
 * memory : 25132KB
 * review : 230817
 */
public class Q004 {
    static boolean[] visited;
    static ArrayList<Integer>[] A;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); //노드
        int m = Integer.parseInt(st.nextToken()); //에지
        int v = Integer.parseInt(st.nextToken()); //시작 노드

        visited = new boolean[n + 1];
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
        DFS(v);
        System.out.println();

        visited = new boolean[n + 1];
        BFS(v);

    }
    private static void DFS(int v) {
        if (visited[v]) {
            return;
        }
        System.out.print(v + " ");
        visited[v] = true;
        List<Integer> list = A[v].stream().sorted().collect(Collectors.toList());
        for (int i : list) {
            DFS(i);
        }
    }
    private static void BFS(int v) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(v);
        visited[v] = true;
        while (!q.isEmpty()) {
            int pollItem = q.poll();
            System.out.print(pollItem + " ");
            List<Integer> list = A[pollItem].stream().sorted().collect(Collectors.toList());
            for (int i : list) {
                if (!visited[i]) {
                    visited[i] = true;
                    q.offer(i);
                }
            }
        }
    }
}
