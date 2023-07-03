package secondReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class q029_review {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int start = 0;
            int end = n - 1;
            int a = Integer.parseInt(st.nextToken());
            boolean check = false;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (a < A[mid]) {
                    end = mid - 1;
                } else if (a > A[mid]) {
                    start = mid + 1;
                } else {
                    check = true;
                    break;
                }
            }
            if (check) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}
