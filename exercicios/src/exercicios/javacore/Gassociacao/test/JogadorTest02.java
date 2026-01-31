package exercicios.javacore.Gassociacao.test;

import exercicios.javacore.Gassociacao.domain.Jogador;
import exercicios.javacore.Gassociacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Casio");

        Time time = new Time("Cracovia");

        jogador1.setTime(time);jogador1.imprime();
    }
}
