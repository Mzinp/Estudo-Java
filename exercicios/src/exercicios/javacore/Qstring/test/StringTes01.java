package exercicios.javacore.Qstring.test;

public class StringTes01 {
    static void main() {
        String str1 = "Aaaa"; // String costant pool
        String str2 = "Aaaa";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        String str3 = "Aaaa";// 1. criando variavel de referencia // 2. obj do tipo String // 3. uma string no pool de String
        System.out.println(str3 == str2);
        System.out.println(str3 == str2.intern());

    }
}
