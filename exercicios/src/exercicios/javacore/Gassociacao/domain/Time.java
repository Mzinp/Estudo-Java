package exercicios.javacore.Gassociacao.domain;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public Time(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println(this.nome);
        if (jogadores == null) return;
        for (Jogador j : jogadores) {
            System.out.println(j.getNome());
        }
    }

    public Jogador[] getJogadores() {
        Jogador[] total = new Jogador[0];
        int cont = 0;
        for (Jogador j : jogadores) {
            total[cont] = j;
            cont++;
        }

        return total;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
