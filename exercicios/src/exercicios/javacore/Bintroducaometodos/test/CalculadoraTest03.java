package exercicios.javacore.Bintroducaometodos.test;

import exercicios.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        double result = cal.divideDoisNumeros(20,2);
        System.out.println(result);
    }
}
