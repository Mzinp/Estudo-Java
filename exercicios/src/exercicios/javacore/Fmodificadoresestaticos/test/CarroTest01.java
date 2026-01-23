package exercicios.javacore.Fmodificadoresestaticos.test;

import exercicios.javacore.Fmodificadoresestaticos.domain.Carro;

public class CarroTest01 {
    static String nome;
    public void setnome(){
        CarroTest01.nome = "Mateus";
        System.out.println("Carro nome: " + CarroTest01.nome);
    }
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 260);
        Carro c3 = new Carro("Audi", 300);

        Carro.setVelocidadeLimite(200);
        System.out.println("Nome: "+ CarroTest01.nome);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
