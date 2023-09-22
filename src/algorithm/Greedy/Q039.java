package algorithm.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 실버 5
 * 1343) 폴리오미노
 * time : 136ms
 * memory : 14184KB
 * review : 230922
 */
public class Q039 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        line = line.replace("XXXX", "AAAA");
        line = line.replace("XX", "BB");
        if (line.contains("X")) {
            System.out.println(-1);
        } else {
            System.out.println(line);

        }

    }
}
