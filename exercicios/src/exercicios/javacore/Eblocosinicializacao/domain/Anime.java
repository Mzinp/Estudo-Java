package exercicios.javacore.Eblocosinicializacao.domain;
//class
public class Anime {
    // vars
    private String nome;
    private int[] eps;
    // bloco de inicializacao
    {
        System.out.println("bloco de inicializacao");
        eps = new int[1200];
        for(int i =0; i < eps.length; i++){
            eps[i]= i +1;
        }
        for(int ep: this.eps) {
            System.out.println(ep +" ");
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
