package exercicios.javacore.Npolimorfismo.test;


import exercicios.javacore.Npolimorfismo.domain.Computador;
import exercicios.javacore.Npolimorfismo.domain.Produto;
import exercicios.javacore.Npolimorfismo.domain.Tomate;
import exercicios.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    static void main() {
        Produto produto = new Computador("Ryzen 9", 3000);

        Tomate tomate = new Tomate("Tomate Americano", 20);
        tomate.setDataValidade("11/12/2021");
        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(produto);
    }
}
