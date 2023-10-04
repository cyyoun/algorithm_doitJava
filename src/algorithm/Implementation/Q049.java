package algorithm.Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 백준 실버 5
 * 8979) 올림픽
 */
public class Q049 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int countryCnt = Integer.parseInt(st.nextToken());
        int findCountry = Integer.parseInt(st.nextToken());
        Set<Integer> set = new HashSet<>();

        int findMedal = 0;
        for (int i = 0; i < countryCnt; i++) {
            String[] arr = br.readLine().split(" ");
            int medal = Integer.parseInt(arr[1].trim() + arr[2].trim() + arr[3].trim());
            set.add(medal);

            if (findCountry == Integer.parseInt(arr[0].trim())) {
                findMedal = medal;
            }
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list.indexOf(findMedal) + 1);


    }
}
