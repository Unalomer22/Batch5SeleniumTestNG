package com.eurotech.test.day07_testNG_intro;

import org.testng.annotations.Test;

public class FirstTestNGTest {

    @Test
    public void Test1(){
        System.out.println("Open de browser");
        System.out.println("First Test Case");
        System.out.println("closing Browser");
    }

    @Test
    public void test2(){
        System.out.println("Test Case 2");
    }


}
