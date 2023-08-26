package algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 백준 실버 2
 * 1541) 잃어버린 괄호
 * time : 124ms
 * memory : 14212KB
 * review : 230826
 */
public class Q014 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        String[] A = line.split("-");
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            int sum = calc(A[i]);
            if (i == 0) result += sum;
            else result -= sum;
        }
        System.out.println(result);
    }

    private static int calc(String s) {
        int sum = 0;
        String[] strings = s.split("\\+");
        for (String str : strings) {
            int i = Integer.parseInt(str);
            sum += i;
        }
        return sum;
    }
}
