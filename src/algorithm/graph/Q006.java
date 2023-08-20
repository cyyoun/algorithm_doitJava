package algorithm.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 백준 실버 2
 * 18352) 특정 거리의 도시 찾기
 * time :
 * memory :
 * review :
 */
public class Q006 {
    static boolean[] visited;
    static int[] distance;
    static ArrayList<Integer>[] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); //노드
        int m = Integer.parseInt(st.nextToken()); //엣지
        int d = Integer.parseInt(st.nextToken()); //거리
        int v = Integer.parseInt(st.nextToken()); //시작 노드
        A = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        distance = new int[n + 1];

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

        BFS(v);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (distance[i] == d) {
                list.add(i);
            }
        }
        if (list.isEmpty()) {
            System.out.println(-1);
        } else {
            Collections.sort(list);
            for (int i : list) {
                System.out.println(i);
            }
        }
    }

    private static void BFS(int v) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(v);
        visited[v] = true;
        while (!q.isEmpty()) {
            int pollItem = q.poll();
            for (int i : A[pollItem]) {
                if (!visited[i]) {
                    visited[i] = true;
                    distance[i] =  distance[pollItem] + 1;
                    q.offer(i);
                }
            }
        }
    }
}
