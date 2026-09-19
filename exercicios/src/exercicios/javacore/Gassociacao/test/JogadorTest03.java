package exercicios.javacore.Gassociacao.test;

import exercicios.javacore.Gassociacao.domain.Jogador;
import exercicios.javacore.Gassociacao.domain.Time;

public class JogadorTest03 {
    static void main() {
        Jogador j1 = new Jogador("Maria");
        Jogador j2 = new Jogador("Mario");
        Jogador j3 = new Jogador("Luigi");
        Time time = new Time("cordas");
        Jogador[] jogadores = {j1, j2, j3};
        j1.setTime(time);

        time.setJogadores(jogadores);
        System.out.println("Time: " + time.getNome());
        System.out.println("Jogadores: " + time.getJogadores());

        time.getNome();
        time.getJogadores();
        
    }
}
