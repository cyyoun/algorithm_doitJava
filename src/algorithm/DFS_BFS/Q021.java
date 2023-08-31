package algorithm.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 백준 실버 1
 * 1743) 음식물 피하기
 * time : 176ms
 * memory : 15560KB
 * review : 230831
 */
public class Q021 {
    static boolean[][] visited;
    static int[][] range;
    static int n, m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); //세로
        m = Integer.parseInt(st.nextToken()); //사로
        int k = Integer.parseInt(st.nextToken()); //음쓰 개수

        visited = new boolean[n + 1][m + 1];
        range = new int[n + 1][m + 1];

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            range[a][b] = 1;
        }
        int result = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (range[i][j] == 1 && !visited[i][j]) {
                    result = Math.max(result, BFS(i, j));
                }
            }
        }
        System.out.println(result);
    }

    private static int BFS(int a, int b) {
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        Queue<int[]> q = new LinkedList<>();
        int cnt = 1;

        visited[a][b] = true;
        q.offer(new int[]{a, b});
        while (!q.isEmpty()) {
            int[] pollItem = q.poll();
            for (int i = 0; i < 4; i++) {
                int x = pollItem[0] + dx[i];
                int y = pollItem[1] + dy[i];
                if (x >= 1 && y >= 1 && x <= n && y <= m) {
                    if (range[x][y] == 1 && !visited[x][y]) {
                        visited[x][y] = true;
                        q.offer(new int[]{x, y});
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}
