package exercicios.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprimir(Estudante aluno){
        System.out.println("---------------------");
        System.out.println(aluno.nome);
        System.out.println(aluno.idade);
        System.out.println(aluno.sexo);
    }
}
