package doitcoding.secondReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q030_2343 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] A = new int[n];
        int start = 0; //최댓값
        int end = 0; //합계
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
            if (start < A[i])
                start = A[i];
            end += A[i];

        }

        while (start <= end) {
            int mid = (start + end) / 2; //중앙값
//            System.out.println("mid = " + mid);
//            System.out.println("start = " + start);
//            System.out.println("end = " + end);
            int sum = 0;
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if (sum + A[i] > mid) { //왜 중앙값보다 커야 하는거지? ㄷㄷ
                    cnt++;
                    sum = 0;
                }
                sum += A[i];
//                System.out.println("sum = " + sum);
            }
//            System.out.println("cnt ======== " + cnt);
            if (sum != 0)
                cnt++;
            if (cnt > m)
                start = mid + 1;
            else
                end = mid - 1;
        }
        System.out.println(start);
    }
}
