package algorithm.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 백준 실버 1
 * 1697) 숨바꼭질
 * time : 172ms
 * memory : 26568KB
 * review : 230830
 */
public class Q017 {
    static int n, m;
    static boolean[] visited = new boolean[100001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        BFS(n);
    }

    private static void BFS(int item) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{item, 0});

        while (!q.isEmpty()) {
            int[] pollItem = q.poll();
            int num = pollItem[0];
            if (!visited[num]) {
                visited[pollItem[0]] = true;
                if (num == m) {
                    System.out.println(pollItem[1]);
                    break;
                } else {
                    int cnt = pollItem[1] + 1;
                    if (num - 1 >= 0 && num - 1 <= 100000) {
                        q.offer(new int[]{num - 1, cnt});
                    }
                    if (num + 1 >= 0 && num + 1 <= 100000) {
                        q.offer(new int[]{num + 1, cnt});
                    }
                    if (num * 2 >= 0 && num * 2 <= 100000) {
                        q.offer(new int[]{num * 2, cnt});
                    }
                }
            }
        }
    }
}


