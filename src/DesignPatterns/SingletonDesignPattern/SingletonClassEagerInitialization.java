package DesignPatterns.SingletonDesignPattern;

public class SingletonClassEagerInitialization {

    private static SingletonClassEagerInitialization singletonInstance = new SingletonClassEagerInitialization();

    private SingletonClassEagerInitialization(){};

    public static SingletonClassEagerInitialization getInstance(){
        return singletonInstance;
    }
}
