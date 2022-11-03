package com.eurotech.test.day07_testNG_intro;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotationsDemo {

    @Test
    public void test1(){
        System.out.println("First Assertion");
        Assert.assertEquals(3,4);

        System.out.println("Second Assertion");
        Assert.assertEquals("url","url");
    }

    @BeforeMethod
    public void setup(){
        System.out.println("Open de Browser");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Close de Browser");
    }
}
