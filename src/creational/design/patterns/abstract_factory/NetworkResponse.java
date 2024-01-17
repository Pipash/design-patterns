package creational.design.patterns.abstract_factory;

public class NetworkResponse implements Response {
    @Override
    public String getResponse() {
        return "Network response!";
    }
}
