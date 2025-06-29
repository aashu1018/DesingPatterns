package DesignPatterns.SingletonDesignPattern.BreakSingletonDesingPattern;

import java.lang.reflect.Constructor;

public class Main {

    public static void main(String[] args) throws Exception {

        SingletonClass singletonClass = SingletonClass.getInstance();
        System.out.println(singletonClass.hashCode());

        //Reflection api
        Constructor<SingletonClass> constructor = SingletonClass.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonClass singletonClass1 = constructor.newInstance();
        System.out.println(singletonClass1.hashCode());

    }

}
