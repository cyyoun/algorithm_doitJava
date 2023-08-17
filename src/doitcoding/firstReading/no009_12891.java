package doitcoding.firstReading;

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

        int[] cc = new int[4];
        for (int i = 0 ; i < 4; i++) {
            cc[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int[] c = new int[4];
        char[] pw = dna.toCharArray();
        int cnt = 0;
        int a = 0;
        for (int i = 0; i < S; i++) {
            char item = pw[i];
            switch (item) {
                case 'A' :
                    c[0]++;
                    break;
                case 'C' :
                    c[1]++;
                    break;
                case 'G' :
                    c[2]++;
                    break;
                case 'T' :
                    c[3]++;
                    break;
                default:
            }

            if (i - a + 1 == P) {
                int chk = 0;
                for (int j = 0; j < 4; j++)
                    if (c[j] >= cc[j]) chk++;
                if (chk == 4) cnt++;

                char itemA = pw[a];
                switch (itemA) {
                    case 'A' :
                        c[0]--;
                        break;
                    case 'C' :
                        c[1]--;
                        break;
                    case 'G' :
                        c[2]--;
                        break;
                    case 'T' :
                        c[3]--;
                        break;
                    default:

                }
                a++;
            }
        }
        System.out.println(cnt);
        bufferedReader.close();
    }
}
