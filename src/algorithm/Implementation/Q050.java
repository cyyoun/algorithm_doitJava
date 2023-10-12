package algorithm.Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 백준 실버 2
 * 2852) NBA 농구
 * time :
 * memory :
 * date :
 */
public class Q050 {
        static SimpleDateFormat sdf = new SimpleDateFormat("mm:ss");
    public static void main(String[] args) throws IOException, ParseException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "00:00");
        map.put(2, "00:00");
        int a = 0, b = 0;
        String startTime = "";
        String endTime = "48:00";

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int team = Integer.parseInt(st.nextToken());
            String time = st.nextToken();
            if (team == 1) a++;
            else b++;
            System.out.println("startTime = " + startTime);

            if (startTime == "") {
                startTime = time;
                continue;
            }
            String diffTime = minusCalc(startTime, time);
            if (a > b) {
                String sumTime = sumCalc(map.get(1), diffTime);
                System.out.println("1111111111sumTime = " + sumTime);
                map.put(1, sumTime);
            } else if (b < a) {
                String sumTime = sumCalc(map.get(2), diffTime);
                System.out.println("222222222222222sumTime = " + sumTime);
                map.put(2, sumTime);
            }
            startTime = time;
        }
        String diffTime = minusCalc(startTime, endTime);
        if (a > b) {
            map.put(1, sumCalc(map.get(1), diffTime));
        } else if (b < a) {
            map.put(2, sumCalc(map.get(2), diffTime));

        }

        System.out.println(map.get(1));
        System.out.println(map.get(2));
    }

    private static String minusCalc(String samllTime, String bigTime) throws ParseException {
        Calendar cal = Calendar.getInstance();
        Date date = sdf.parse(bigTime);
        cal.setTime(date);
        cal.add(Calendar.MINUTE, -Integer.parseInt(samllTime.split(":")[0]));
        cal.add(Calendar.SECOND, -Integer.parseInt(samllTime.split(":")[1]));

        String formatDate = sdf.format(cal.getTime());
        return formatDate;
    }

    private static String sumCalc(String time1, String time2) throws ParseException {
        Calendar cal = Calendar.getInstance();
        Date date = sdf.parse(time1);
        cal.setTime(date);
        cal.add(Calendar.MINUTE, Integer.parseInt(time2.split(":")[0]));
        cal.add(Calendar.SECOND, Integer.parseInt(time2.split(":")[1]));

        String formatDate = sdf.format(cal.getTime());
        return formatDate;

    }
}
