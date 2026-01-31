package exercicios.javacore.Fmodificadoresestaticos.domain;

public class Anime {
    private String nome;
    private static int[] episodios;
    static{
        episodios = new int[100];
        String man = "Paulo";
        System.out.println("Anime inicializado"+ man);
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
            System.out.println("Episodio "+episodios[i]);
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }
    public Anime(){
        System.out.println();
    }
    public int[] getEpisodios() {
        return episodios;
    }
}
