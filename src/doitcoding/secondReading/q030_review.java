package doitcoding.secondReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q030_review {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] A = new int[n];
        int start = 0;
        int end = 0;
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
            end += A[i];
            if (start < A[i])
                start = A[i];
        }

        while (start <= end) {
            int mid = (start + end) / 2;
            System.out.println("mid = " + mid);
            int cnt = 0;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += A[i];
                //순서대로 더한 합계가 중앙값보다 같거나 커질 때 카운팅
                    System.out.println("sum = " + sum);
                if (sum >= mid) {
                    cnt++;
                    sum = 0;
                }
            }
            if (sum != 0)
                cnt++;
            if (cnt <= m)
                end = mid - 1;
            else
                start = mid + 1;
            }


        System.out.println(start);

        }
    }

