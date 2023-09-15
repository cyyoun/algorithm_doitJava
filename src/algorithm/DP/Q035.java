package algorithm.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 실버 1
 * 15989) 1, 2, 3 더하기 4
 * time : 168ms
 * memory : 14844KB
 * review : 230915
 */
public class Q035 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            cntOfMethod(Integer.parseInt(br.readLine()));
        }

    }

    private static void cntOfMethod(int item) {
        int cnt = 1 + item / 2;
        while (item > 0) {
            item = item - 3;
            if (item < 0) {
                break;
            } else if (item == 0) {
                cnt += 1;
            } else {
                cnt += (1 + item / 2);
            }

        }
        System.out.println(cnt);

    }
}


