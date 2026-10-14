package exercicios.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    static void main() throws IOException {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() throws IOException {
        File file = new File("arquivo/test.txt");
        try {
            file.createNewFile();
            System.out.println("Arquivo criado com sucesso!");

        } catch (IOException e) {
            e.printStackTrace();
            throw e;
            
        }

    }
}
