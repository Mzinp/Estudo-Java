package exercicios.javacore.Eblocosinicializacao.test;

import exercicios.javacore.Eblocosinicializacao.domain.Anime;

public class AnimeTest {
    static void main() {
        Anime anime = new Anime("One Piece");

        for(int ep: anime.getEps()) {
            System.out.print(ep+" ");
        }


    }
}
