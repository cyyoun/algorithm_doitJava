package secondReading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class q009_12891 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken()); //문자열 길이
        int p = Integer.parseInt(st.nextToken()); //부분 문자열 길이
        String DNA = br.readLine();
        char[] dnaA = DNA.toCharArray();

        st = new StringTokenizer(br.readLine());
        int[] conditionA = new int[4];
        for (int i = 0; i <= 3; i++) {
            conditionA[i] = Integer.parseInt(st.nextToken());
        }

        Map<Character, Integer> dnaM = new HashMap<>();
        dnaM.put('A', 0);
        dnaM.put('C', 1);
        dnaM.put('G', 2);
        dnaM.put('T', 3);



        int i = 0;
        int j = 1;
        int[] cntA = new int[4];
        int cnt = 0;

        if (dnaM.containsKey(dnaA[i]))
            ++cntA[dnaM.get(dnaA[i])];

        while (i < j && j < s) {
            if (dnaM.containsKey(dnaA[j]))
                ++cntA[dnaM.get(dnaA[j])];
            if(j - i < p) {
                j++;
            } else if (j - i == p) {
                if (conditionA[0] <= cntA[0] && conditionA[1] <= cntA[1] && conditionA[2] <= cntA[2] && conditionA[3] <= cntA[3]) cnt++;
                j++;
                i++;
                if (dnaM.containsKey(dnaA[i]))
                    --cntA[dnaM.get(dnaA[i])];
            } else {
                i++;
                if (dnaM.containsKey(dnaA[i]))
                    --cntA[dnaM.get(dnaA[i])];
            }
        }
        System.out.println(cnt);
    }
}
