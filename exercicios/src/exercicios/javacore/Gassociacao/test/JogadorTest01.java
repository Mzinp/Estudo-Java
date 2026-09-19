package exercicios.javacore.Gassociacao.test;

import exercicios.javacore.Gassociacao.domain.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Maria");
        Jogador jogador2 = new Jogador("Julia");
        Jogador jogador3 = new Jogador("Julio");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for(Jogador jogador: jogadores) {
            jogador.imprimir();
        }
    }
}
