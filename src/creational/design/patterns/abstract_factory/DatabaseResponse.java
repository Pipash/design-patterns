package creational.design.patterns.abstract_factory;

public class DatabaseResponse implements Response {
    @Override
    public String getResponse() {
        return "Database Response!";
    }
}
