package algorithm.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 백준 골드 3
 * 1167) 트리의 지름 구하기
 * time :
 * memory :
 * review : 230821(fail)
 */

public class Q007 {
    static ArrayList<int[]>[] A;
    static boolean[] visited;
    static int[] distance;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int v = Integer.parseInt(br.readLine());
        A = new ArrayList[v + 1];
        for (int i = 1; i <= v; i++) {
            A[i] = new ArrayList<>();
        }

        for (int i = 0; i < v; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            while (true) {
                int node = Integer.parseInt(st.nextToken());
                if (node == -1)  break;
                int weight = Integer.parseInt(st.nextToken());
                A[a].add(new int[]{node, weight});
            }
        }
        visited = new boolean[v + 1];
        distance = new int[v + 1];
        BFS(1);
        int Max = 1;
        for (int i = 2; i <= v; i++) {
            if (distance[Max] < distance[i]) {
                Max = i;
            }
        }
        visited = new boolean[v + 1];
        distance = new int[v + 1];
        BFS(Max);

        Arrays.sort(distance);
        System.out.println(distance[v]);
    }

    private static void BFS(int item) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(item);
        visited[item] = true;
        while (!q.isEmpty()) {
            int pollItem = q.poll();
            for (int[] i : A[pollItem]) {
                int node = i[0];
                if (!visited[node]) {
                    int weight = i[1];
                    distance[node] = distance[pollItem] + weight;
                    visited[node] = true;
                    q.offer(node);
                }
            }
        }
    }
}
