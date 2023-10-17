package algorithm.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * 백준 골드 5
 * 16500) 문자열 판별
 * time :
 * memory :
 * date :
 */
public class Q056 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[101];
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }
        for (int i = line.length() - 1; i >= 0; i--) {
            for (int j = i + 1; j < line.length(); j++) {
                if (dp[j] == 1) {
                    if (set.contains(line.substring(i, j))) {
                        dp[i] = 1;
                    }
                }
            }
            if (set.contains(line.substring(i))) {
                dp[i] = 1;
            }
        }
        System.out.println(dp[0]);
    }
}
