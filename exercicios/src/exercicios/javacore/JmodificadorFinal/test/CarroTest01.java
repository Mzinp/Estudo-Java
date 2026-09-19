package exercicios.javacore.JmodificadorFinal.test;

import exercicios.javacore.JmodificadorFinal.domain.Carro;
import exercicios.javacore.JmodificadorFinal.domain.Comprador;
import exercicios.javacore.JmodificadorFinal.domain.Ferrari;

public class CarroTest01 {
    static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador2 = new Comprador();
        Ferrari ferrari = new Ferrari();
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("junio");
        System.out.println(carro.COMPRADOR);
        ferrari.setNome("Ferrari");
        ferrari.imprime();
        carro.imprime();
    }
}
