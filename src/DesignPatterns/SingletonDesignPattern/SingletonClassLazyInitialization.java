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

    //T1 checks singletonInstance == null → true
    //enters synchronized block.
    //Before T1 creates instance, T2 also checks singletonInstance == null → still true
    //waits at synchronized block.
    //T1 creates instance and exits block.
    //Now T2 enters synchronized block — if we didn’t check again,
    //it would create another instance, violating Singleton pattern.
}
