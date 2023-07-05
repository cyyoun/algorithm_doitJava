package secondReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class q036_1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] mSplit = str.split("-");

        int mini = 0;
        for (int i = 0; i < mSplit.length; i++) {
            String[] pSplit = mSplit[i].split("[+]");

            if (i == 0) {
                mini += getPlus(pSplit);

            } else {
                mini -= getPlus(pSplit);
            }
        }
        System.out.println(mini);
    }

    private static int getPlus(String[] pSplit) {
        int a = 0;
        for (int j = 0; j < pSplit.length; j++) {
            a += Integer.parseInt(pSplit[j]);
        }
        return a;
    }
}
