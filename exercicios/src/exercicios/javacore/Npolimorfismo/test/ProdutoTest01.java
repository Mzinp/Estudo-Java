package exercicios.javacore.Npolimorfismo.test;

import exercicios.javacore.Npolimorfismo.domain.Computador;
import exercicios.javacore.Npolimorfismo.domain.Televisao;
import exercicios.javacore.Npolimorfismo.domain.Tomate;
import exercicios.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    static void main(String[] args) {
        Computador computador = new Computador("n150", 1000);
        Tomate tomate = new Tomate("tomate americano", 6);
        Televisao tv = new Televisao("tv \"90\" ", 1500);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("---");

        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(tv);

    }
}
