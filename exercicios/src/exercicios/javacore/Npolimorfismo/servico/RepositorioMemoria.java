package exercicios.javacore.Npolimorfismo.servico;

import exercicios.javacore.Npolimorfismo.repisitory.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memoria");
    }
}
