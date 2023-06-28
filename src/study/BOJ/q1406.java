package study.BOJ;

import java.io.*;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class q1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> lstack = new Stack<>();
        Stack<String> rstack = new Stack<>();
        for (String i : br.readLine().split(""))
            lstack.push(i);

        int n = Integer.parseInt(br.readLine());



        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();

            switch (a) {
                case "P":
                    String b = st.nextToken();
                    lstack.push(b);
                    break;
                case "L":
                    if(!lstack.isEmpty())
                        rstack.push(lstack.pop());
                    break;
                case "D":
                    if(!rstack.isEmpty())
                        lstack.push(rstack.pop());
                    break;
                case "B" :
                    if (!lstack.isEmpty())
                        lstack.pop();
                    break;
                default :
                    break;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (!lstack.isEmpty()) {
            rstack.push(lstack.pop());
        }
        while (!rstack.isEmpty()) {
            bw.write(rstack.pop());
        }

        bw.flush();
        bw.close();
    }
}
