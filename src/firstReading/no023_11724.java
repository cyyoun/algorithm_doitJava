package firstReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class no023_11724 {
        static boolean[] visited;
        static ArrayList<Integer>[] A;
    public static void main (String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        // 인접리스트 생성하기
        visited = new boolean[N + 1];
        A = new ArrayList[N + 1];

        for (int i = 0; i < N + 1; i++) {
            A[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < M; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            A[a].add(b);
            A[b].add(a);
        }
        int cnt = 0;


        for (int i = 1; i < N + 1; i++) {
            if (!visited[i]) {
                cnt++;
                DFS(i); //재귀
            }
        }
        System.out.println(cnt);
    }

    private static void DFS(int v) {
        if (visited[v]) {
            return;
        }
        visited[v] = true;
        for (int i : A[v]) {
            if (!visited[i]) {
                DFS(i);
            }
        }
    }
}
