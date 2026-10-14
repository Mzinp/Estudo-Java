package exercicios.javacore.Oexception.Runtime.test;

public class RuntimeExceptionTest02 {
    static void main() {
        try {

            System.out.println(divisao(2, 1));
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param a
     * @param b
     * @return
     * @throws IllegalArgumentException
     */
    private static int divisao(int a, int b) throws IllegalArgumentException {
        if (a == 0 || b == 0) {
            throw new IllegalArgumentException("nao pode ser 0");
        }
        try {
            return a / b;
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
