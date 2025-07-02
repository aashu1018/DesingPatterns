package DesignPatterns.AbstractFactoryDesignPattern;

public class BackendDeveloper implements Employee{

    @Override
    public int salary() {
        return 2000000;
    }

    @Override
    public String name() {
        return "Backend Developer";
    }
}
