package DesignPatterns.StrategyDesignPattern.With;

public class Main {

    public static void main(String[] args) {

        GoodsVehicle goodsVehicle = new GoodsVehicle();
        goodsVehicle.drive();

        SportsVehicle sportsVehicle = new SportsVehicle();
        sportsVehicle.drive();
    }
}
