import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class NumInfo {
    int n,ind;
    NumInfo(int n, int ind) {
        this.n = n;
        this.ind = ind;
    }
}
public class no016_1377 {
    public static void main (String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        ArrayList<NumInfo> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int k = Integer.parseInt(bufferedReader.readLine());
            A.add(new NumInfo(k, i));
        }
        Collections.sort(A, (a, b) -> {
            return a.n - b.n;
        });

        int max = 0 ;
        for (int i = 0; i < N ; i++) {
            int item = A.get(i).ind - i;
            if (max < item)
                max = item;
        }
        System.out.println(max + 1);
    }
}
