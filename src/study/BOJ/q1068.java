package study.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class q1068 {
    static ArrayList<Integer>[] A;
    static int m;
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(br.readLine());
        int tokens = st.countTokens();
        A = new ArrayList[tokens];

        for (int i = 0; i < tokens; i++) {
            A[i] = new ArrayList<>();
        }


        for (int i = 0; i < tokens; i++) {
            int node = Integer.parseInt(st.nextToken());
            if (node == -1)
                continue;
            A[node].add(i);
        }
        DFS(0);
        System.out.println(cnt);
    }

    private static void DFS(int item) {
        if (item == m) return;
        if (A[item].size() == 0) cnt++;
        else {
            for (int i : A[item]) {
                if (i == m)
                    continue;

                if(A[i].size() == 0) {
                    cnt++;
                } else {
                    DFS(i);
                }
            }
        }
    }
}
