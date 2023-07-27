package Programmers.lev1_2;

import java.util.*;

public class 달리기경주 {
    public static void main(String[] args) {

        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        System.out.println(Arrays.toString(solution(players, callings)));


    }
    public static String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        for (String call : callings) {
            int idx = map.get(call);
            String temp = players[idx];
            players[idx] = players[idx - 1];
            players[idx - 1] = temp;

            map.put(players[idx - 1], idx - 1);
            map.put(players[idx], idx);
        }
        return players;
    }
}



