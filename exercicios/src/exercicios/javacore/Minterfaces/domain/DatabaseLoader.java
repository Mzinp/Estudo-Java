package exercicios.javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Loading Database");
    }

    @Override
    public void remove() {
        System.out.println("Removing Database");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking Database in database");
    }
}
