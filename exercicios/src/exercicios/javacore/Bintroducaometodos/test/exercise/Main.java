package exercicios.javacore.Bintroducaometodos.test.exercise;

public class Main {
    public static void main(String[] args) {
        Funcionarios f = new Funcionarios();
        f.nome = "Joao";
        f.idade = 18;
        f.salario = new double[]{1500.52,2000.31,1700.67};
        f.mediaSalario(f.salario);
        f.imprimeDados();
    }
}
