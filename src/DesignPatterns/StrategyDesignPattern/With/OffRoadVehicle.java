package DesignPatterns.StrategyDesignPattern.With;

import DesignPatterns.StrategyDesignPattern.With.Strategy.SportsDriveCapability;

public class OffRoadVehicle extends Vehicle{

    public OffRoadVehicle(){
        super(new SportsDriveCapability());
    }
}
