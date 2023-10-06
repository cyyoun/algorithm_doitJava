package algorithm.Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1157) 단어공부
 */
public class Q052 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine().toUpperCase();
        int[] A = new int[26];

        for (int i = 0; i < line.length(); i++) {
            int index = line.charAt(i) - 65;
            A[index]++;
        }
        int maxCnt = 0;
        for (int i = 0; i < 26; i++) {
            maxCnt = Math.max(A[i], maxCnt);
        }
        int cnt = 0, idx = 0;;
        for (int i = 0; i < 26; i++) {
            if (maxCnt == A[i]) {
                cnt++;
                idx = i;
            }
        }
        if (cnt > 1) {
            System.out.println("?");
        } else {
            System.out.println((char) (idx + 65));
        }
    }
}
