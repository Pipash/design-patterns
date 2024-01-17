package creational.design.patterns.abstract_factory;

public class DatabaseService implements Service{
    @Override
    public String runService() {
        return "Database service is running";
    }
}
