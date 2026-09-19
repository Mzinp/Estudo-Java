package exercicios.javacore.Lclassesabstratas.domain;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        super.toString();
        return "sendo executado dentro da class gerente";
    }
}
