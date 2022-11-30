package com.eurotech.test.day14_propertiesSingleton;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.sql.Driver;

public class Singleton {

    // singleton class will have private constructor
    // it means other classes can NOT create an object of this class

    private Singleton() {

    }

    private static String str;

    public static String getInstance() {
        if (str == null) {
            System.out.println("str is null, assigning a value to it");
            str = "some value";
        } else {
            System.out.println("it has value, just returning it");
        }

        return str;
    }

}
