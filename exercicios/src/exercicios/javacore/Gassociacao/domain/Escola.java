package exercicios.javacore.Gassociacao.domain;

public class Escola {
    private String nome;
    private Professor[] professores;

    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public Escola(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println(this.nome);
        if (professores == null) return;
        for (Professor p : professores) {
            System.out.println(p.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
