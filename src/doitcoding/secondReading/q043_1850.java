package doitcoding.secondReading;

import java.io.*;
import java.util.StringTokenizer;

public class q043_1850 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long rem = -1;
        while (rem != 0) {
            rem = b % a;
            if (rem != 0) {
                b = a;
                a = rem;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < a; i++) {
//            sb.append(1);
            bw.write("1");
        }
        bw.flush();
        bw.close();
    }
}
