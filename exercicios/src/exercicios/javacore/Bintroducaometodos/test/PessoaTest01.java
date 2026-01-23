package exercicios.javacore.Bintroducaometodos.test;

import exercicios.javacore.Bintroducaometodos.dominio.Pessoa;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        ExecutorService executor = Executors.newFixedThreadPool(5);
        executor.submit(()->{
            int c = 0;
            while(true){
                c+=1;
                System.out.println("hello world");
                if(c == 10){
                    return;
                }
            }
        });

        pessoa.setNome("mateus");
        pessoa.setIdade(18);
        pessoa.getNome();
        pessoa.getIdade();
        while(true){

            System.out.println(pessoa.getNome());
        }
    }
}
