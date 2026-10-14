package exercicios.javacore.Npolimorfismo.domain;

public class Computador extends Produto {
    public static final double IMPOSTO = 0.21;

    public Computador(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando Imposto do computador");
        return this.preco * IMPOSTO;
    }



}
