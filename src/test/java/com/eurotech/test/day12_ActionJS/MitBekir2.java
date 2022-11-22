package com.eurotech.test.day12_ActionJS;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class MitBekir2 {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        //  driver.quit();
    }
    @Test
    public void test1() throws InterruptedException {
        driver.get("https://www.google.com");
        Thread.sleep(10000);
        WebElement googleSearchTextBox =driver.findElement(By.name("q"));
        googleSearchTextBox.sendKeys("asd" + Keys.ENTER);

        Actions action = new Actions(driver);
        action.sendKeys(Keys.END).perform();

    }

}
