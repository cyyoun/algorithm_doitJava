package Programmers.lev1_2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class _2016년 {
    public String solution(int a, int b) {

        LocalDate date = LocalDate.of(2016, a, b);
        DayOfWeek day = date.getDayOfWeek();

        String answer = day.getDisplayName(TextStyle.SHORT, Locale.US).toUpperCase();


        return answer;
    }

}
