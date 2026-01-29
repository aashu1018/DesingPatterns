package DesignPatterns.StrategyDesignPattern.With;

import DesignPatterns.StrategyDesignPattern.With.Strategy.NormalDriveCapability;

public class GoodsVehicle extends Vehicle{

    public GoodsVehicle(){
        super(new NormalDriveCapability());
    }
}
