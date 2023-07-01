package secondReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class q029_1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            int item = Integer.parseInt(st.nextToken());
            A[i] = item;
        }
        Arrays.sort(A);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int findItem = Integer.parseInt(st.nextToken());
           int start = 0;
           int end = m - 1;
           boolean find = false;

           while (start <= end) {
               int index = (start + end) / 2;
               int value = A[index];

               if (findItem < value) {
                   end = index - 1;
               } else if (findItem > value) {
                   start = index + 1;
               } else {
                   find = true;
                   break;
               }
           }
           if (find)
               System.out.println(1);
            else
               System.out.println(0);
        }
    }
}
