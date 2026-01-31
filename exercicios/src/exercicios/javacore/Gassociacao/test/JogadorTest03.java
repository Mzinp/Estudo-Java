package exercicios.javacore.Gassociacao.test;

import exercicios.javacore.Gassociacao.domain.Jogador;
import exercicios.javacore.Gassociacao.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador player = new Jogador("neymaaaar");
        Jogador player2 = new Jogador("Pelllleeé");
        Time time = new Time("Íbis Sport Club");
        Jogador[]  players = {player, player2};
        player.setTime(time);

        time.setPlayers(players);

        System.out.println("--- Time ---");
        time.print();
        System.out.println("--- Jogadores ---");
        player.imprime();

    }
}
