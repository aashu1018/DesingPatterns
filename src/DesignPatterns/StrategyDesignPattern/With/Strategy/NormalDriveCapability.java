package DesignPatterns.StrategyDesignPattern.With.Strategy;

public class NormalDriveCapability implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("normal drive capability");
    }
}
