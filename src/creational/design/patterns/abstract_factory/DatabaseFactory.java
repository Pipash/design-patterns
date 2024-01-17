package creational.design.patterns.abstract_factory;

public class DatabaseFactory implements DatasourceAbstractFactory {
    @Override
    public Service createService() {
        return new DatabaseService();
    }

    @Override
    public Response createResponse() {
        return new DatabaseResponse();
    }
}
