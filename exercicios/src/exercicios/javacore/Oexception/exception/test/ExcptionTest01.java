package exercicios.javacore.Oexception.exception.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExcptionTest01 {
    static void main() {
        for (int i = 0; i <= 1000; i++) {

            criarNovoArquivo(" salve " + i);
        }

    }

    private static void criarNovoArquivo(String text) {
        File file = new File("arquivo/test.txt");
        try (FileWriter fw = new FileWriter(file)) {

            file.createNewFile();
            fw.write(text);
            System.out.println("Arquivo criado com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro ao criar novo arquivo" + e.getMessage());
            System.out.println("----------------");
            e.printStackTrace();
        }

    }
}
