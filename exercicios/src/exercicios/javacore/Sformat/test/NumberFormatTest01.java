package exercicios.javacore.Sformat.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    static void main() {
        NumberFormat[] nfa = new NumberFormat[4];
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeCN = Locale.CHINA;
        Locale localeDefault = Locale.getDefault();
        NumberFormat nf = NumberFormat.getCurrencyInstance(localeDefault);

        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeBR);
        nfa[2] = NumberFormat.getInstance(localeJP);
        nfa[3] = NumberFormat.getInstance(localeCN);

        double value = 10_000_000.0;
        System.out.println("Default: " + localeDefault + "\n");
        for (NumberFormat n : nfa) {
            System.out.println(nf.format(value));
            System.out.println("=========");

        }
    }
}
