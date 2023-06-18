package study.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11720 {
    public static void main (String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        String m = bufferedReader.readLine();
        char[] A = m.toCharArray();
        int su = 0;
        for (int i = 0 ; i < n; i++) {
            su += Integer.parseInt(String.valueOf(A[i]));
        }
        System.out.println(su);
    }
}

