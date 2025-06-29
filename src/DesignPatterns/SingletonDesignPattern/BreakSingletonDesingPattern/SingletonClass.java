package DesignPatterns.SingletonDesignPattern.BreakSingletonDesingPattern;

public class SingletonClass {

    private static SingletonClass singletonInstance = new SingletonClass();

    private SingletonClass(){
        //to avoid breaking using reflection api
        if(singletonInstance != null){
            throw new RuntimeException("You are trying to break the singleton pattern");
        }
    }

    public static SingletonClass getInstance(){
        return singletonInstance;
    }
}
