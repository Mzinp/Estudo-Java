package exercicios.javacore.Npolimorfismo.test;

import exercicios.javacore.Npolimorfismo.domain.Computador;
import exercicios.javacore.Npolimorfismo.domain.Produto;

public class ProdutoTest02 {
    static void main() {
        Produto produto = new Computador("Ryzen 9", 3000);
        
        System.out.println(produto.getNome());
        System.out.println(produto.getPreco());
    }
}
