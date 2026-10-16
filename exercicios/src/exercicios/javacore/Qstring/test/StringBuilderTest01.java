package exercicios.javacore.Qstring.test;

public class StringBuilderTest01 {
    static void main() {
        String nome = "mateus ";
        StringBuilder sb = new StringBuilder(nome);
        sb.delete(0, nome.length());
        System.out.println(sb.length());
        System.out.println(nome);

        System.out.println(nome);
    }
}
