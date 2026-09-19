package exercicios.javacore.Hheranca.domain;

public class Funcionario extends Pessoa {

    static {
        System.out.println("dentro do staic de Funcionario");
    }

    private double salario;

    {
        System.out.println("dentro do bloco de inicializacao nao static1 de Funcionario");
    }

    {
        System.out.println("dentro do bloco de inicializacao nao static2 de Funcionario");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("dentro do contructor de funcionario de Funcionario");
    }

    public Funcionario(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }


    public void imprime() {
        super.imprime();
        System.out.println("salario: " + salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu: " + this.nome + "recebi o salario de: " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
