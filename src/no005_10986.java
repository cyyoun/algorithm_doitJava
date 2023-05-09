import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no005_10986 {
    public static void main (String args[]) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        long[] S = new long[N + 1];
        long[] A = new long[M]; //이 배열이 왜 필요한거지..?
        long cnt = 0;

        for (int i = 1; i <= N; i++) {
            S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
            int a = (int) (S[i] % M);

            A[a]++; //전혀 생각치도 못 했는 방법이당...ㅇ0ㅇ

            if (a == 0)
                cnt++;
        }

        for (int i = 0; i < M; i++) {
            if (A[i] > 1)
            cnt += A[i] * (A[i] - 1) / 2; //조합(nCr)에 의해 식 만들어짐
        }
        System.out.println(cnt);
    }
}
