package exercicios.javacore.Oexception.exception.test;

import exercicios.javacore.Oexception.exception.domain.Funcionario;
import exercicios.javacore.Oexception.exception.domain.Pessoa;

public class SobreEscritaComExceptionTest01 {
    static void main() {
        Pessoa p1 = new Pessoa();
        Funcionario f1 = new Funcionario();

        f1.salvar();

    }
}
