import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no009_12891 {
    public static void main (String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int S = Integer.parseInt(stringTokenizer.nextToken());
        int P = Integer.parseInt(stringTokenizer.nextToken());
        String dna = bufferedReader.readLine();

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int pwA = Integer.parseInt(stringTokenizer.nextToken());
        int pwC = Integer.parseInt(stringTokenizer.nextToken());
        int pwG = Integer.parseInt(stringTokenizer.nextToken());
        int pwT = Integer.parseInt(stringTokenizer.nextToken());

        int cnt = 0;
        for (int i = 0; i < (S - P + 1);  i++) {
            int k = 0;
            int cntA = 0, cntC = 0, cntG = 0, cntT = 0;
            char[] pw = dna.substring(i, i + P).toCharArray();

            while (k < P ) {
                char item = pw[k];
                switch (item) {
                    case 'A' :
                        cntA++;
                        break;
                    case 'C' :
                        cntC++;
                        break;
                    case 'G' :
                        cntG++;
                        break;
                    case 'T' :
                        cntT++;
                        break;
                    default:
                }
                if (cntA == pwA && cntC == pwC && cntG == pwG && cntT == pwT) {
                    cnt++;
                    break;
                }
                k++;
            }
        }
        System.out.println(cnt);
        bufferedReader.close();
    }
}
