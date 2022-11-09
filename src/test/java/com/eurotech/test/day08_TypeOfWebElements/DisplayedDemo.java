package com.eurotech.test.day08_TypeOfWebElements;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisplayedDemo {

    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        driver.manage().window().maximize();

        WebElement startButton = driver.findElement(By.cssSelector("#start>button"));

        WebElement hello = driver.findElement(By.xpath("//*[text()='Hello World!']"));
        System.out.println("hello.isDisplayed() = " + hello.isDisplayed());

        Assert.assertFalse(hello.isDisplayed(), "verify that element is NOT displayed");
        startButton.click();

        Thread.sleep(5000);
        Assert.assertTrue(hello.isDisplayed(),"Verify that element is DISPLAYED");

        System.out.println("hello.getText() = " + hello.getText());

/*
        driver.close();

         */
    }



}
