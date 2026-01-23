package exercicios.javacore.Csobrecargametodos.test;

import exercicios.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        //metodo all
        anime.init("gachacuta", "TV", 1);
        anime.setGenero("Ação");
        /*
        metods old
        anime.setNome("gachacuta");
        anime.setTipo("Tomato");
        anime.setEpisodios(1);
        */
        anime.imprime();
    }
}
