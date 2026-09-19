package exercicios.javacore.Gassociacao.test;

import exercicios.javacore.Gassociacao.domain.Escola;
import exercicios.javacore.Gassociacao.domain.Professor;

public class EscolaTest01 {
    static void main() {
        Professor p = new Professor("jiraia");
        Professor p2 = new Professor("eu");
        Professor p3 = new Professor("doido");
        Professor[] professores = {p, p2, p3};
        Escola e1 = new Escola("konora", professores);

        e1.imprime();
    }
}
