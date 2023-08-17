package doitcoding.firstReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class no046_18352 {
    static  int[] visited;
    static ArrayList<Integer>[] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); //도시 개수
        int m = Integer.parseInt(st.nextToken()); //도로 개수
        int k = Integer.parseInt(st.nextToken()); //최단 거리
        int x = Integer.parseInt(st.nextToken()); //출발 도시 번호

        visited = new int[n + 1];
        A = new ArrayList[n + 1];

        for (int i = 0; i <= n; i++) {
            A[i] = new ArrayList<>();
        }

        for (int i = 1; i <= m; i ++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            A[a].add(b);

        }

        for (int i = 0; i <= n; i++) {
            visited[i] =  -1;
        }

        List<Integer> result = new ArrayList<>();

        BFX(x);

        for (int i = 0; i <= n; i++) {
            if (visited[i] == k) {
                result.add(i);
            }
        }

        if (result.size() == 0)
            System.out.println("-1");
        else {
            Collections.sort(result);
            for (int i : result) {
                System.out.println(i);
            }
        }
    }
    private static void BFX(int x) {
        Queue<Integer> q = new LinkedList<>();
        q.add(x);
        visited[x]++;
        while (!q.isEmpty()) {
            int nowNode = q.poll();
            for (int i : A[nowNode]) {
                q.offer(i);
            }
        }
    }
}
