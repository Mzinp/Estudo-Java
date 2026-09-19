package exercicios.javacore.Gassociacao.test;

import exercicios.javacore.Gassociacao.domain.Jogador;
import exercicios.javacore.Gassociacao.domain.Time;

public class JogadorTest02 {
    static void main() {
        Jogador j1 = new Jogador("Joao");
        Time time = new Time("cordas");

        j1.setTime(time);
        j1.imprimir();
    }
}
