import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class no020_2751 {
    public static void main (String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(bufferedReader.readLine());
        ArrayList<Integer> l = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            l.add(Integer.parseInt(bufferedReader.readLine()));
        }

        Collections.sort(l);

        for (Integer c : l) {
            sb.append(c).append("\n");
        }
        System.out.println(sb);


    }
}
