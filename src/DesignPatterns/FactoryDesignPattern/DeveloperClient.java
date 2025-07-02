package DesignPatterns.FactoryDesignPattern;

public class DeveloperClient {

    public static void main(String[] args) {

        //Here we have tight coupling, and also the responsibility of object creation lies with the client
//        Employee employee = new BackendDeveloper();
//        Employee employee1 = new FullStackDeveloper();

        Employee employee = EmployeeFactory.getEmployee("Backend Dev");
        int sal = employee.salary();
        System.out.println("Backend Developer salary is: " + sal);
    }
}
