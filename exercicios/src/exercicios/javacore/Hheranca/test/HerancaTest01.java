package exercicios.javacore.Hheranca.test;

import exercicios.javacore.Hheranca.domain.Endereco;
import exercicios.javacore.Hheranca.domain.Funcionario;
import exercicios.javacore.Hheranca.domain.Pessoa;

public class HerancaTest01 {
    static void main() {
        Endereco endereco = new Endereco();
        endereco.setRua("Avenida Q");
        endereco.setCep("00000-111");
        Pessoa p = new Pessoa("pedro");
        System.out.print("Pessoa: ");

        p.setEndereco(endereco);
        p.setIdade(18);
        p.imprime();
        System.out.println(' ');
        System.out.print("funcionario: ");
        Funcionario f = new Funcionario("padre");

        f.setEndereco(endereco);
        f.setIdade(18);
        f.setSalario(2000);

        f.imprime();

    }
}
