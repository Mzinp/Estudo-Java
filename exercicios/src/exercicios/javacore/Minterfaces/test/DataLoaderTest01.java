package exercicios.javacore.Minterfaces.test;


import exercicios.javacore.Minterfaces.domain.DatabaseLoader;
import exercicios.javacore.Minterfaces.domain.FileLoader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DataLoaderTest01 {
    static void main(String[] args) {
        DatabaseLoader loader = new DatabaseLoader();
        FileLoader file = new FileLoader();

        loader.load();
        file.load();
        File arquivo = new File("/home/mateus/estudo/java/Estudo-Java/exercicios/src/exercicios/javacore/Minterfaces/test/test.txt");
        try (Scanner scanner = new Scanner(arquivo)) {
            // Enquanto houver uma próxima linha no arquivo, ele continua lendo
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                System.out.println(linha);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        }
        System.out.println("-------------------");

        loader.remove();
        file.remove();

        loader.checkPermission();
        file.checkPermission();
    }

}
