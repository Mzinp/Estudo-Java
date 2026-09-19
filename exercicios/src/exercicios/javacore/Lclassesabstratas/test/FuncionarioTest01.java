package exercicios.javacore.Lclassesabstratas.test;

import exercicios.javacore.Lclassesabstratas.domain.Desenvolvedor;
import exercicios.javacore.Lclassesabstratas.domain.Gerente;

public class FuncionarioTest01 {
    static void main(String[] args) {

        Gerente gerente = new Gerente("Padre", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Maria", 10000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
