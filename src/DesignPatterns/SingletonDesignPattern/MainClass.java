package DesignPatterns.SingletonDesignPattern;

public class MainClass {

    public static void main(String[] args) {
        SingletonClassLazyInitialization singletonMethod = SingletonClassLazyInitialization.getInstance();
        System.out.println(singletonMethod.hashCode());

        SingletonClassLazyInitialization singletonMethod1 = SingletonClassLazyInitialization.getInstance();
        System.out.println(singletonMethod1.hashCode());

        SingletonClassEagerInitialization singletonMethod2 = SingletonClassEagerInitialization.getInstance();
        System.out.println(singletonMethod2.hashCode());

        SingletonClassEagerInitialization singletonMethod3 = SingletonClassEagerInitialization.getInstance();
        System.out.println(singletonMethod3.hashCode());
    }
}
