package firstReading;

import java.io.*;
import java.util.StringTokenizer;

public class no043_1850 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long result = gcd(a, b);
        while (result > 0) {
            bw.write("1");
            result--;
        }
        bw.flush();
        bw.close();

    }

    private static long gcd(long a, long b) {
        if (b == 0)
            return a;
        else return gcd(b, a % b);
    }
}
