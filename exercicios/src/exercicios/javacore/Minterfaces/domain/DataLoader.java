package exercicios.javacore.Minterfaces.domain;

public interface DataLoader {
    int val = 10;

    void load();

    default void checkPermission() {
        System.out.println("metodo check default");
    }

}
