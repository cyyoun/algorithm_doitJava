package algorithm.Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 실버 2
 * 14719) 빗물
 * time :
 * memory :
 * review :
 */

public class Q037 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int height = Integer.parseInt(st.nextToken());
        int width = Integer.parseInt(st.nextToken());
        int[] hArr = new int[width];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < width; i++) {
            hArr[i] = Integer.parseInt(st.nextToken());
        }

        int result = 0;

        for (int i = 1; i < width - 1; i++) { //인덱스 별 모이는 빗물. 첫, 마지막 제외
            int left = 0;
            int right = 0;

            for(int j = 0; j < i; j++) {
                left = Math.max(hArr[j], left);
            }

            for(int j = i + 1; j < width; j++) {
                right = Math.max(hArr[j], right);
            }

            if(hArr[i] < left && hArr[i] < right) result += Math.min(left, right) - hArr[i];
        }
        System.out.println(result);




    }
}
