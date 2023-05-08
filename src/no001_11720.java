import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 숫자의 합 구하기
public class no001_11720 {
    public static void main (String args[]) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        String M = bufferedReader.readLine();

        char[] arr = M.toCharArray();

        int su = 0;

        for (int i = 0 ; i < N; i++) {
            su += Integer.parseInt(String.valueOf(arr[i]));
        }
        System.out.println(su);
    }
}
