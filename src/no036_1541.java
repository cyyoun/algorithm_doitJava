import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no036_1541 {
    static int result = 0;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = String.valueOf(br.readLine());
        String[] S = str.split("-");

        for (int i = 0; i < S.length; i++) {
            int temp = SUM(S[i]);
            if (i == 0)
                result = result + temp;
            else result = result - temp;
        }
        System.out.println(result);
    }
    static int SUM(String s) {
        int sum = 0;
        String temp[] = s.split("[+]");
        for (int i = 0; i < temp.length; i++) {
            sum += Integer.parseInt(temp[i]);
        }
            return sum;
    }
}

