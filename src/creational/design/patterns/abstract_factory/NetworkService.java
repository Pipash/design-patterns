package creational.design.patterns.abstract_factory;

public class NetworkService implements Service {
    @Override
    public String runService() {
        return "Network Service running!";
    }
}
