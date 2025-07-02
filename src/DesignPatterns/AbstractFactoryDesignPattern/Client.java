package DesignPatterns.AbstractFactoryDesignPattern;


public class Client {

    public static void main(String[] args) {

        Employee e1 = EmployeeFactory.getEmployee(new BackendDevFactory());
        System.out.println(e1.salary());

        Employee e2 = EmployeeFactory.getEmployee(new FullStackDevFactory());
        System.out.println(e1.name());
    }
}
