package exercicios.javacore.Bintroducaometodos.test.exercise.exemple;

import exercicios.javacore.Bintroducaometodos.test.exercise.exemple.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("joão");
        funcionario.setIdade(18);
        funcionario.setSalarios(new double[]{1,1,2});
        System.out.println(funcionario.getMedia());
        funcionario.imprimeMediaSalarial();

    }
}
