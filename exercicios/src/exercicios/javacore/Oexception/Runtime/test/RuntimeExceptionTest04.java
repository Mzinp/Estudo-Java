package exercicios.javacore.Oexception.Runtime.test;

import java.io.FileNotFoundException;

public class RuntimeExceptionTest04 {
    static void main() {
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println();
        }
        try {
            exception();
        }catch(ArrayIndexOutOfBoundsException |  FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    private static void exception() throws  ArrayIndexOutOfBoundsException, FileNotFoundException {}

}
