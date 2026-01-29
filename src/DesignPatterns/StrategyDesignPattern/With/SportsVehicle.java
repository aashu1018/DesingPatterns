package DesignPatterns.StrategyDesignPattern.With;

import DesignPatterns.StrategyDesignPattern.With.Strategy.SportsDriveCapability;

public class SportsVehicle extends Vehicle{

    public SportsVehicle(){
        super(new SportsDriveCapability());

    }
}
