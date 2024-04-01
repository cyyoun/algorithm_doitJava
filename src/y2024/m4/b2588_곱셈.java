package y2024.m4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2588_곱셈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String m = br.readLine();

        for (int i = m.length() - 1; i >= 0 ; i--) {
            int mm = Integer.parseInt(m.charAt(i) + "");
            System.out.println(n * mm);
        }
        System.out.println(n * Integer.parseInt(m));
    }
}
