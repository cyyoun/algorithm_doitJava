package firstReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q9625 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int a = 1;
        int b = 0;

        for (int i = 1; i <= n; i++) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        System.out.println(a + " " + b);
    }
}
