package doitcoding.firstReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class no025_13023 {
    static ArrayList<Integer>[] A;
    static boolean flag;
    static boolean[] visited;

    public static void main (String[] agrs) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        A = new ArrayList[N];
        visited = new boolean[N];


        for (int i = 0 ; i < N; i++) {
            A[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < M; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());

            A[a].add(b);
            A[b].add(a);
        }

        for (int i = 0; i < N; i++) {
            DFS(i, 1);
            if (flag) break;
        }

        if (flag) System.out.println(1);
        else System.out.println(0);
    }

    private static void DFS(int c, int cnt) {
        if (cnt == 5) {
            flag = true;
            return;
        }
        visited[c] = true;
        for (int i : A[c]) {
            if (!visited[i])
            DFS(i, cnt + 1);
        }
        visited[c] = false;
    }
}

