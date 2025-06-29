package DesignPatterns.FactoryDesignPattern;

public class EmployeeFactory {

    public static Employee getEmployee(String empType){

        if(empType.trim().equals("Backend Dev")){
            return new BackendDeveloper();
        }else if(empType.trim().equals("FullStack Dev")){
            return new FullStackDeveloper();
        }
        return null;
    }
}
