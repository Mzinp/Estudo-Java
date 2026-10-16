package exercicios.javacore.Rdates.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    static void main() {
        Calendar c = Calendar.getInstance();
        if (c.getFirstDayOfWeek() == Calendar.SUNDAY) System.out.println("primeiro dia da semana");

        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        //c.add(Calendar.DAY_OF_MONTH, 2);
        // c.add(Calendar.HOUR, 12);
        c.roll(Calendar.DAY_OF_YEAR, -1);
        Date date = c.getTime();
        System.out.println(date);
    }
}
