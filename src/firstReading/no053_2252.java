package firstReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class no053_2252 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); //학생 수
        int m = Integer.parseInt(st.nextToken()); //비교 횟수

        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer>[] A = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            A[i] = new ArrayList<>();
        }

        int[] degree = new int[n + 1];
        for (int i = 0; i < m; i ++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            A[a].add(b);
            degree[b]++;
        }


        for (int i = 1; i <= n; i++) {
            if (degree[i] == 0) {
                queue.offer(i); // POINT : degree가 0인 값들 모두 queue에다가 넣어줌
            }
        }
        while (!queue.isEmpty()) {
            int q = queue.poll();
            System.out.println(q + " ");
            for (int i : A[q]) {
                degree[i]--;
             if (degree[i] == 0) {
                 queue.add(i);
             }
            }
        }
    }
}
