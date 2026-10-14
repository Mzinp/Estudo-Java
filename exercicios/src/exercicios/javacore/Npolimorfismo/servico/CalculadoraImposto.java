package exercicios.javacore.Npolimorfismo.servico;

import exercicios.javacore.Npolimorfismo.domain.Produto;
import exercicios.javacore.Npolimorfismo.domain.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("relatorio de imposto: ");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getPreco());
        System.out.println("Imposto a ser pago: " + imposto);
        if (produto instanceof Tomate tomate) {
            if (tomate.getDataValidade() == null) {
                System.out.println("validade nao especificado");
                return;
            }
            System.out.println(tomate.getDataValidade());
        }

    }
}
