package exercicios.javacore.Gassociacao.domain;

public class Time {
    private String nome;
    private Jogador[] players;

    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, Jogador[] players) {
        this.nome = nome;
        this.players = players;
    }

    public void print(){
        System.out.println(this.nome);
        if (this.players == null) return;
        for (Jogador player: this.players){
            System.out.println(player.getNome());
        }
    }

    public Jogador[] getPlayers() {
        return players;
    }

    public void setPlayers(Jogador[] players) {
        this.players = players;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
