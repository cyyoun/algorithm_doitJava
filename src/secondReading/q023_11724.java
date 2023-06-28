package secondReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class q023_11724 {
    static boolean[] visited;
    static Stack<Integer> stack;
    static ArrayList<Integer>[] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        A = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        stack = new Stack<>();
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
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                DFS(i);
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    private static void DFS(int item) {
        stack.push(item);
        visited[item] = true;
        int popItem = stack.pop();
        for (int i : A[popItem]) {
            if(!visited[i]) {
                stack.push(i);
                visited[i] = true;
            }
        }
        while (!stack.isEmpty()) {
            DFS(stack.pop());
        }
    }
}
