package com.eurotech.test.day07_testNG_intro;

import org.testng.annotations.*;

public class BeforeAfterMethod {

    @Test
    public void test3(){
        System.out.println("First Test Case");
    }

    @BeforeMethod
    public void setup(){
        System.out.println("Opening the Browser");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("Closing Browser");
    }
    @Test
    public void test2(){
        System.out.println("Test Case 2");
    }

    @Test
    public void test1(){
        System.out.println("Test Case 1");
    }

    @BeforeClass
    public static void SetupClass(){
        System.out.println("-------BEFORECLASS------------");
        System.out.println("Her Class da bir defa calisir");
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("-------AFTERCLASS------------");
        System.out.println("Her Class da bir defa calisir");
    }

    @Ignore
    public void test4(){
        System.out.println("Ignore");
    }
}
