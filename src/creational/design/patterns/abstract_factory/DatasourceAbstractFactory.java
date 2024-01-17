package creational.design.patterns.abstract_factory;

public interface DatasourceAbstractFactory {
    Service createService();
    Response createResponse();
}
