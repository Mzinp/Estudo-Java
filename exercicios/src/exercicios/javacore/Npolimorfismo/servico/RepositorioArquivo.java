package exercicios.javacore.Npolimorfismo.servico;

import exercicios.javacore.Npolimorfismo.repisitory.Repositorio;

public class RepositorioArquivo implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando arquivo");
    }

}
