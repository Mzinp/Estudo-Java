package exercicios.javacore.Npolimorfismo.servico;

import exercicios.javacore.Npolimorfismo.repisitory.Repositorio;

public class RepositorioBancoDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados");
    }
}
