package DesignPatterns.StrategyDesignPattern.With;

import DesignPatterns.StrategyDesignPattern.With.Strategy.NormalDriveCapability;

public class PassengerVehicle extends Vehicle{

    public PassengerVehicle(){
        super(new NormalDriveCapability());
    }
}
