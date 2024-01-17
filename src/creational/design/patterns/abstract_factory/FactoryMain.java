package creational.design.patterns.abstract_factory;

public class FactoryMain {
    public static void main(String[] args) {
        Client databaseClient = new Client(new DatabaseFactory());
        databaseClient.communicate();

        Client networkClient = new Client(new NetworkFactory());
        networkClient.communicate();
    }
}
