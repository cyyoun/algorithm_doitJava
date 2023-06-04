package firstReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class no068_1068 {

    static ArrayList<Integer>[] tree;
    static boolean[] visited;
    static int answer = 0;
    static int deleteNode = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        tree = new ArrayList[n];
        visited = new boolean[n];
        int root = 0;
        for (int i = 0; i < n; i++) {
            tree[i] = new ArrayList<Integer>();
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(st.nextToken());
            if (k != -1) {
                tree[i].add(k);
                tree[k].add(i);
            } else
                root = i;
        }
        deleteNode = Integer.parseInt(br.readLine());
        if (deleteNode == root) {
            System.out.println(0);
        } else {
            DFS(root);
            System.out.println(answer);
        }
    }

    private static void DFS(int number) {
        visited[number] = true;
        int node = 0;
        for (int i : tree[number]) {
            if (visited[i] == false && i != deleteNode) {
                node++;
                DFS(i);
            }
        }
        if (node == 0) {
            answer++;
        }
    }
}
