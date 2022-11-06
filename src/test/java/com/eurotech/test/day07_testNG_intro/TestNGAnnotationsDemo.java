package com.eurotech.test.day07_testNG_intro;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotationsDemo {

    @Test
    public void test1(){
        System.out.println("First Assertion");
        Assert.assertEquals(3,3);

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
    @Test
    public void test2(){
        Assert.assertEquals("test2","test2");

    }
    @Test
    public void test3(){
        String expected = "puro";
        String actual = "Eurotech";

        Assert.assertTrue(actual.startsWith(expected));
        Assert.assertTrue(actual.startsWith(expected),"verify that title starting");
    }

    @Test
    public void test4(){
        String  email = "eurotech@gmail.com";
        if(email.contains("@")){
            System.out.println("Pass");
        }else{
            System.out.println("False");
        }
        Assert.assertTrue(email.contains("@"));
    }
}
