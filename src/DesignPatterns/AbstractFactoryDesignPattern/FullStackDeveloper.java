package DesignPatterns.AbstractFactoryDesignPattern;

public class FullStackDeveloper implements Employee{

    @Override
    public int salary() {
        return 2500000;
    }

    @Override
    public String name() {
        return "FullStack Developer";
    }
}
