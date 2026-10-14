package exercicios.javacore.Minterfaces.domain;

public class FileLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Loading arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Removing Database");
    }
}
