package com.concepts.dp.creational.singletondp;

import java.lang.reflect.Constructor;

//Check logs
//Hash code vareis after setting singleton class as accessible, which shows new  instance is created each time .

public class ReflectionSingletonDestroy {

    public static void main(String[] args) {
        EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instanceOne_1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instanceTwo = null;
        EagerInitializedSingleton instanceTwo_1 = null;
        try {
            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
            	System.out.println(constructor);
                constructor.setAccessible(true);
                System.out.println(constructor);
                instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
                instanceTwo_1 =(EagerInitializedSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceOne_1.hashCode());
        System.out.println(instanceTwo.hashCode());
        System.out.println(instanceTwo_1.hashCode());
    }

}