package exercicios.javacore.Bintroducaometodos.test.exercise.exemple;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;
    public void imprime(){
        if(salarios == null){
            return;
        }
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println("Salario: ");
        for(double n: this.salarios) {System.out.print(n);
            System.out.print(" | ");
        }

    }
    public void imprimeMediaSalarial(){
        double media = 0;

        for(double salario: this.salarios){
            media = media + salario;
            System.out.println(salario);
        }
        media = media/this.salarios.length;
        System.out.println("\nMedia salarial: "+ media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }

}
