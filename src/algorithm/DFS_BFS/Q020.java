package algorithm.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * 백준 실버 1
 * 11403) 경로 찾기
 * time : 540ms
 * memory : 26672KB
 * review : 230831
 */

public class Q020 {
    static ArrayList<Integer>[] A;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        A = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            A[i] = new ArrayList<>();
        }
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                int item = Integer.parseInt(st.nextToken());
                if (item == 1) {
                    A[i].add(j);
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                visited = new boolean[n + 1];
                System.out.print(DFS(i, j) + " ");
            }
            System.out.println();
        }
    }
    private static int DFS(int a, int b) {
        Stack<Integer> s = new Stack<>();
        s.push(a);
        while (!s.isEmpty()) {
            int popItem = s.pop();
            for (int i : A[popItem]) {
                if (i == b) {
                    return 1;
                }
                if (!visited[i]) {
                    visited[i] = true;
                    s.push(i);
                }
            }
        }
        return 0;
    }
}
