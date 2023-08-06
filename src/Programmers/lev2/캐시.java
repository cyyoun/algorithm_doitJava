package Programmers.lev2;

import java.util.ArrayList;

public class 캐시 {
    public int solution(int cacheSize, String[] cities) {
        ArrayList<String> q = new ArrayList<>();
        int totalTime = 0;
        for (int i = 0; i < cities.length; i++) {
            if (cacheSize == 0) {
                totalTime += 5;
                continue;
            }
            String city = cities[i].toUpperCase();
            if (!q.contains(city)){
                if (q.size() >= cacheSize) {
                    q.remove(0);
                }
                q.add(city);
                totalTime += 5;
            } else {
                totalTime += 1;
                q.remove(city);
                q.add(city);

            }
        }
        return totalTime;
    }
}
