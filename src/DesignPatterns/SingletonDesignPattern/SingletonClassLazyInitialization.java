package DesignPatterns.SingletonDesignPattern;

public class SingletonClassLazyInitialization {

    private static SingletonClassLazyInitialization singletonInstance;

    private SingletonClassLazyInitialization(){}

    //might create trouble in a multithreaded environment since multiple threads may try to
    // create the object at the same time
//    public static SingletonClassLazyInitialization getInstance(){
//        if(singletonInstance==null){
//            singletonInstance = new SingletonClassLazyInitialization();
//        }
//        return singletonInstance;
//    }

    //for multi-threading
    public static SingletonClassLazyInitialization getInstance(){
        if(singletonInstance==null){
            synchronized (SingletonClassLazyInitialization.class){
                if(singletonInstance==null){
                    singletonInstance = new SingletonClassLazyInitialization();
                }
            }
        }
        return singletonInstance;
    }
}
