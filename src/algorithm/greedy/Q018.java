package algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 백준 골드 5
 * 1092) 배
 * time : 392ms
 * memory : 16396KB
 * review : 230831
 */

public class Q018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); //크레인 개수
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> craneArr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            craneArr.add(Integer.parseInt(st.nextToken()));
        }

        int m = Integer.parseInt(br.readLine()); //박스 개수
        st = new StringTokenizer(br.readLine());
        ArrayList<Integer> boxArr = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            boxArr.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(craneArr, Collections.reverseOrder());
        Collections.sort(boxArr, Collections.reverseOrder());

        if (craneArr.get(0) < boxArr.get(0)) {
            System.out.println(-1);
            return;
        }
        int result = 0;
        //ArrayList 도 isEmpty() 가 있다니..!
        while (!boxArr.isEmpty()) {
            int boxIdx = 0;
            for (int i = 0; i < n; i++) {
                if (boxIdx == boxArr.size()) break; //이 부분 잘 이해가..
                else if (craneArr.get(i) >= boxArr.get(boxIdx)) {
                    boxArr.remove(boxIdx);
                } else {
                    boxIdx++;
                    i--;
                }
            }
            result++;
        }
        System.out.println(result);
    }
}
