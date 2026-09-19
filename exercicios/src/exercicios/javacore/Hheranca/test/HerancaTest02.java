package exercicios.javacore.Hheranca.test;

import exercicios.javacore.Hheranca.domain.Funcionario;

public class HerancaTest02 {
    static void main() {
        // 0 - Bloco de inicialização estático da super classe é executado quando a JVM carregar classe filha
        // 1 - Alocado espaço em memória pro objeto
        // 2 - Cada atributo de classe é criado e inicializado com valores default ou o quer for passado
        // 3 - Bloco de inicialização é executado
        // 4 - Construtor é executado


        Funcionario f = new Funcionario("Pedro");

    }
}
