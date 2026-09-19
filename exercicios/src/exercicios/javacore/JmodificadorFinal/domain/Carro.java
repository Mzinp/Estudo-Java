package exercicios.javacore.JmodificadorFinal.domain;

public class Carro {
    public static final double VELOCIADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();
    private String nome;

    public final void imprime() {
        System.out.println(this.nome);
    }

    public Comprador getCOMPRADOR() {
        return COMPRADOR;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
