package exercicios.javacore.Bintroducaometodos.test.exercise;

public class Funcionarios {
    public String nome;
    public int idade;
    public double[] salario = {};


    public void mediaSalario(double... numeros) {
        double soma  = 0;
        for(double n: numeros){
            soma = soma + n;
        }
        System.out.println("Soma Total: "+ soma);
        String format = String.format("%.2f", soma);
        System.out.printf("Media: %.2f",soma/numeros.length,"\n");
    }
    public void imprimeDados(){
        System.out.print("\nSalario: ");
        for(double n: this.salario){
            int valor = (int) n;
            System.out.print(valor);
            System.out.print(" | ");
        }
        System.out.println("\nNome: "+this.nome);
        System.out.println("Idade: "+this.idade);

    }
}
