package exercicios.javacore.Pwrapper.test;

public class rapperTest01 {
    static void main() {
        byte byteP = 1;
        Byte bytew = 1; // autoboxing
        bytew.byteValue();
        //System.out.println(bytew);
        int P = bytew.byteValue();

        Integer intW2 = null;
        try {
            intW2 = Integer.parseInt("1");
        } catch (NumberFormatException e) {
            System.err.println("nao e aceito nums" + e.getMessage());
            System.err.println("------------------");
            e.printStackTrace();
        }
        System.out.println(intW2);
        Character charW2 = null;
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isDigit(0));
        System.out.println("01110000 01110010 01101001 01101110 01110100 00101000 00100010 01101111 01101100 01100001 00100000 01101101 01110101 01101110 01100100 01101111 00100010 00101001 00111011 ");
    }
}
