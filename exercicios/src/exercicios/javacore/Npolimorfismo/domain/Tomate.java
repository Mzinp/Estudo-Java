package exercicios.javacore.Npolimorfismo.domain;

public class Tomate extends Produto {
    public static final double IMPOSTO = 0.06;
    String dataValidade;

    public Tomate(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando Imposto do tomate");
        return this.preco * IMPOSTO;
    }

    public String getDataValidade() {
        System.out.println("Data de Validade do tomate: ");
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        System.out.println("Data de Validade do tomate: " + dataValidade);
        this.dataValidade = dataValidade;
    }
}
