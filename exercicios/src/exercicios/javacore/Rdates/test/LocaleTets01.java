package exercicios.javacore.Rdates.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTets01 {
    static void main() {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeFrance = new Locale("fr", "FR");
        Locale localeIndia = new Locale("in", "IN");
        Locale localeJapan = new Locale("ja", "JP");
        Locale localeHolanda = new Locale("nl", "NL");

        Calendar c = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeFrance);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);

        System.out.println("Italy: " + df1.format(c.getTime()));
        System.out.println("France: " + df2.format(c.getTime()));
        System.out.println("India " + df3.format(c.getTime()));
        System.out.println("Japan: " + df4.format(c.getTime()));
        System.out.println("Holanda: " + df5.format(c.getTime()));

        System.out.println(localeItaly.getDisplayCountry());
        System.out.println(localeItaly.getDisplayLanguage());

    }
}
