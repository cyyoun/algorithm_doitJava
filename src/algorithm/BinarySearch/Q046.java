package algorithm.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 백준 실버 4
 * 2870) 수학숙제
 * time :
 * memory :
 * review :
 */
public class Q046 {
    static ArrayList<BigInteger> A = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            getNumber(line);
        }
        Collections.sort(A);
        for (BigInteger i : A) {
            System.out.println(i);
        }
    }

    private static void getNumber(String line) {
        String s = line.replaceAll("[a-z]", " ");
        s = s.replaceAll("\\s+", " ").trim();
        String[] split = s.split(" ");


        for (int i = 0; i < split.length; i++) {
            A.add(new BigInteger(split[i]));
        }
    }
}
