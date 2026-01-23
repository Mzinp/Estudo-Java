package exercicios.javacore.Bintroducaometodos.test;

import exercicios.javacore.Bintroducaometodos.dominio.Estudante;
import exercicios.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante.nome = "Pedro";
        estudante.idade = 20;
        estudante.sexo = 'M';

        estudante2.nome = "Pedrita";
        estudante2.idade = 20;
        estudante2.sexo = 'F';

        impressora.imprimir(estudante);
    }
}
