package exercicios.javacore.Aintroducaoclasses.desafio_carro.src;

import exercicios.javacore.Aintroducaoclasses.desafio_carro.dist.Carro;
import exercicios.javacore.Aintroducaoclasses.desafio_carro.dist.Son;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();
        Son soma = new Son();
        carro.ano = 2021;
        carro.modelo = "Ford";
        carro.marca = "Fiat";

        carro2.ano = 2021;
        carro2.modelo = "Fiat";
        carro2.marca = "Fiat";

        System.out.println(carro.ano + " " + carro.modelo + " " + carro.marca);
        System.out.println("----------------------");
        System.out.println(carro2.ano + " " + carro2.modelo + " " + carro2.marca);
        System.out.println("----------------------");
        System.out.println(soma.soma(11,11));
    }
}
