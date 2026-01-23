package exercicios.javacore.Eblocosinicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;
    {
        this.episodios = new int[100];
        String man = "Paulo";
        System.out.println("Anime inicializado"+ man);
        for (int i = 0; i < this.episodios.length; i++) {
            this.episodios[i] = i+1;
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
