package exercicios.javacore.Oexception.Runtime.test;

public class RuntimeExceptionTest03 {
    static void main() {
        abreConexao();
    }

    private static void abreConexao() {
        try {
            System.out.println("abrindo arquivo");
            throw new RuntimeException("teste");
            // System.out.println("escrevendo dados do arquivo");
        } catch (Exception e) {
            System.out.println("erro ao abrir arquivo | " + e.getMessage());
            //e.printStackTrace();
        } finally {
            System.out.println("fechando o recurso do arquivo");
        }
    }
}
