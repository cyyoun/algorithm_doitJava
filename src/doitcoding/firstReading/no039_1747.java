package doitcoding.firstReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no039_1747 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] A = new int[10000001];

        for (int i = 2; i < A.length; i++) {
            A[i] = i;
        }

        for (int i = 2; i < Math.sqrt(A.length); i++) {
            if (A[i] == 0) continue;
            for (int j = i + i; j < A.length; j = j + i) {
                A[i] = 0;
            }
        }

        int i = n;
        while (true) {
            if (A[i] != 0) {
                int result = A[i];
                if (isPalindrom(result)) {
                    System.out.println(result);
                    break;
                }

            }
            i++;
        }
    }
    private static boolean isPalindrom(int result) {
        char[] temp = String.valueOf(result).toCharArray();
        int s = 0;
        int e = temp.length - 1;
        while (s < e) {
            if (temp[s] != temp[e])
                return false;
            s++;
            e--;
        }
        return true;
    }
}
