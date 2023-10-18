package algorithm.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 실버 2
 * 16953) A에서 B
 * time :
 * memory :
 * date : 231018
 */
public class Q057 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int cnt = 1;
        while (a != b) {
            if (b < a) {
                System.out.println(-1);
                return;
            }
            String s = String.valueOf(b);
            if (b % 2 == 0) {
                b /= 2;
            } else if (s.charAt(s.length() - 1) == '1') {
                s = s.substring(0, s.length() - 1);
                b = Integer.parseInt(s);
            } else {
                System.out.println(-1);
                return;
            }
            cnt++;
        }
        System.out.println(cnt);

    }
}

