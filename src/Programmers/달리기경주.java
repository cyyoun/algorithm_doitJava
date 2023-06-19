package Programmers;

import java.util.HashMap;
import java.util.Map;

public class 달리기경주 {
    public static void main(String[] args) {

        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        solution(players, callings);

    }
    public static String[] solution(String[] players, String[] callings) {


        Map<String, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            indexMap.put(players[i], i);
        }

        for (String calling : callings) {
            int idx = indexMap.get(calling);
            String temp = players[idx - 1];
            players[idx - 1] = players[idx];
            players[idx] = temp;

            indexMap.put(players[idx - 1], idx - 1);
            indexMap.put(players[idx], idx);
        }


        return players;
    }
}



