package exercicios.javacore.Lclassesabstratas.domain;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
        calculaBonus();
    }
    

    @Override
    public void calculaBonus() {
        System.out.println("Bonus de Gerente");
    }

    @Override
    public String toString() {
        super.toString();
        return "sendo executado dentro da class gerente";
    }
}
