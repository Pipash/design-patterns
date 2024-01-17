package creational.design.patterns.abstract_factory;

public class NetworkFactory implements DatasourceAbstractFactory {
    @Override
    public Service createService() {
        return new NetworkService();
    }

    @Override
    public Response createResponse() {
        return new NetworkResponse();
    }
}
