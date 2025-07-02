package DesignPatterns.AbstractFactoryDesignPattern;

public class BackendDevFactory extends EmployeeAbstractFactory{

    @Override
    public Employee createEmployee() {
        return new BackendDeveloper();
    }
}
