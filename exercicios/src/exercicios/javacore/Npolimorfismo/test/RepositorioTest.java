package exercicios.javacore.Npolimorfismo.test;

import exercicios.javacore.Npolimorfismo.servico.RepositorioBancoDados;

public class RepositorioTest {
    static void main() {
        RepositorioBancoDados repositorioBancoDados = new RepositorioBancoDados();
        repositorioBancoDados.salvar();
    }
}
