package y2024.m4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class b2606_바이러스 {
    static boolean[] visited;
    static ArrayList<Integer>[] A;
    static int num = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine()); //컴퓨터 수
        int m = Integer.parseInt(br.readLine()); //컴퓨터 쌍
        visited = new boolean[n + 1];
        A = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            A[i] = new ArrayList<>();
        }
        for (int i = 0; i < m ; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            A[a].add(b);
            A[b].add(a);
        }
        DFS(1);
        System.out.println(num - 1);
    }

    private static void DFS(int a) {
        if (visited[a]) {
            return;
        }
        visited[a] = true;
        num++;
        ArrayList<Integer> arr = A[a];
        for (Integer i : arr) {
            DFS(i);
        }
    }
}
