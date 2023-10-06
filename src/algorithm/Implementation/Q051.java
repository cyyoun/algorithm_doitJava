package algorithm.Implementation;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * 1159) 농구경기
 */

public class Q051 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] A = new int[26];

        for (int i = 0; i < n; i++) {
            int index = br.readLine().charAt(0) - 97;
            A[index]++;
        }
        int cnt = 0;
        for (int i = 0; i < 26; i++) {
            if (A[i] >= 5) {
                cnt++;
                System.out.print((char) (97 + i));
            }
        }
        if (cnt == 0) System.out.println("PREDAJA");


    }
}
