package exercicios.javacore.Bintroducaometodos.test;

import exercicios.javacore.Bintroducaometodos.dominio.Calculadora;
import exercicios.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTestJava02 {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        estudante.nome = "Pedro";
        estudante.idade = 20;
        estudante.sexo = 'M';

        estudante2.nome = "Pedrita";
        estudante2.idade = 20;
        estudante2.sexo = 'F';

        estudante.imprime();
    }
}
