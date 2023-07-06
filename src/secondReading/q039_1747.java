package secondReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q039_1747 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] A = new int[10000001];

        for (int i = 2; i < A.length; i++) {
            A[i] = i;
        }
        for (int i = 2; i < Math.sqrt(A.length); i++) {
            if (A[i] == 0)
                continue;
            for (int j = i + i; j < A.length; j = j + i) {
                 A[j] = 0;
            }
        }
        for (int i = n; i < A.length; i++) {
            if (A[i] != 0) {
                char[] str = String.valueOf(A[i]).toCharArray() ;
                int s = 0;
                int e = str.length - 1;
                boolean chk = true;
                while (s < e) {
                    if (str[s] != str[e]) {
                        chk = false;
                        break;
                    }
                    s++;
                    e--;
                }
                if (chk) {
                    System.out.println(A[i]);
                    break;
                }
            }

        }

    }
}
