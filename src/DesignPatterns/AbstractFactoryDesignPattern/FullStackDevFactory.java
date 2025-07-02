package DesignPatterns.AbstractFactoryDesignPattern;

public class FullStackDevFactory extends EmployeeAbstractFactory{

    @Override
    public Employee createEmployee() {
        return new FullStackDeveloper();
    }
}
