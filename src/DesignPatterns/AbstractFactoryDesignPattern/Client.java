package DesignPatterns.AbstractFactoryDesignPattern;


public class Client {

    public static void main(String[] args) {

        EmployeeAbstractFactory backendFactory = new BackendFactory();

        Employee dev = backendFactory.createEmployee();
        Manager mgr = backendFactory.createManager();

        System.out.println(dev.name());
        System.out.println(mgr.getManager());


        EmployeeAbstractFactory fsFactory = new FullStackFactory();

        Employee dev2 = fsFactory.createEmployee();
        Manager mgr2 = fsFactory.createManager();

        System.out.println(dev2.name());
        System.out.println(mgr2.getManager());

    }
}
