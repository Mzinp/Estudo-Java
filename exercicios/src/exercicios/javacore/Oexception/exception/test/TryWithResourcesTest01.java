package exercicios.javacore.Oexception.exception.test;

import exercicios.javacore.Oexception.exception.domain.Leitor1;
import exercicios.javacore.Oexception.exception.domain.Leitor2;

import java.io.IOException;

public class TryWithResourcesTest01 {
    static void main() {
        lerArquivo2();
    }

    static void lerArquivo2() {
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {

        } catch (IOException erro) {
            erro.printStackTrace();
        }
    }
    /*
    static void lerArquivo() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test.txt"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

     */
}

