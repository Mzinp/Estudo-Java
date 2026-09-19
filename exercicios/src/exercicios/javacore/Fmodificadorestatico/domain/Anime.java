package exercicios.javacore.Fmodificadorestatico.domain;
//class
public class Anime {
    // vars
    private String nome;
    private static int[] eps;
    // bloco de inicializacao
    static {
        System.out.println("bloco de inicializacao");

        eps = new int[1200];
        for(int i =0; i < eps.length; i++){
            eps[i]= i +1;
        }
        for(int ep: eps) {
            System.out.print(ep +" ");
        }
        System.out.println("----------------");
    }

    //contructors param
    public Anime(String nome) {
        this.nome  = nome;
    }

    public Anime() {

    }

    //gets e sets

    public String getNome() {
        return nome;
    }

    public int[] getEps() {
        return eps;
    }
}
