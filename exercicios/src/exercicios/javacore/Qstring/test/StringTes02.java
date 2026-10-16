package exercicios.javacore.Qstring.test;

public class StringTes02 {
    static void main() {
        String nome = "      Mateus";
        String num = "12345";
        System.out.println(nome.length());
        System.out.println(nome.replace("M", "1"));
        System.out.println(nome.toUpperCase());
        System.out.println(num.substring(0, 4));
        System.out.println(num);
        System.out.println(nome.substring(3));
        System.out.println(nome.trim());
    }
}
