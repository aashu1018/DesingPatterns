package DesignPatterns.StrategyDesignPattern.With.Strategy;

public class SportsDriveCapability implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("sports drive capability");
    }
}
