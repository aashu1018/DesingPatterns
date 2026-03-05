package DesignPatterns.AbstractFactoryDesignPattern;

public class BackendFactory implements EmployeeAbstractFactory {

    @Override
    public Employee createEmployee() {
        return new BackendDeveloper();
    }

    @Override
    public Manager createManager() {
        return new BackendManager();
    }
}
