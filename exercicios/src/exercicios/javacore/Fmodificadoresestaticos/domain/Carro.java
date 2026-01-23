package exercicios.javacore.Fmodificadoresestaticos.domain;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadelimite = 250;

    public static void setVelocidadeLimite(double velocidadelimite) {
        Carro.velocidadelimite = velocidadelimite;

    }
    public static double getVelocidadeLimite() {
        return Carro.velocidadelimite;
    }
    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("----------------------------");
        System.out.println("Nome: "+this.nome);
        System.out.println("Velocidade maxima: "+this.velocidadeMaxima);
        System.out.println("Velocidade limite: "+Carro.velocidadelimite);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadelimite() {
        return velocidadelimite;
    }

    public void setVelocidadelimite(double velocidadelimite) {
        this.velocidadelimite = velocidadelimite;
    }
}
