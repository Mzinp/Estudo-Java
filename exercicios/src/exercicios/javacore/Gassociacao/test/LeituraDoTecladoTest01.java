package exercicios.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o 1 num: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o 2 num: ");
        int num2 = sc.nextInt();

        if (num1 == 0 || num2 == 0) {
            if (num1 != 0) {
                System.out.println(num1);
            }
            if (num2 != 0) {
                System.out.println(num2);
            }
            return;
        }

        System.out.println(num1 + num2);
    }
}
