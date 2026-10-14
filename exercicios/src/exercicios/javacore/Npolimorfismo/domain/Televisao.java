package exercicios.javacore.Npolimorfismo.domain;

public class Televisao extends Produto {
    public static final double IMPOSTO = 0.06;

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calcular imposto da tv: ");
        return this.preco * IMPOSTO;
    }

}
