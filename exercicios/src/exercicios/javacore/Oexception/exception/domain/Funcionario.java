package exercicios.javacore.Oexception.exception.domain;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa {
    public void salvar() {
        try {
            super.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            System.out.println("Login invalido");
        }
    }
}
