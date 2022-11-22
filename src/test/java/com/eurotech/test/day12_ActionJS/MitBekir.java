package com.eurotech.test.day12_ActionJS;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MitBekir {

    WebDriver driver;


    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(4000);
        //driver.quit();
    }

    @Test
    public void test1() throws InterruptedException {
        driver.get("https://demoqa.com/droppable");

       WebElement dragMe = driver.findElement(By.id("draggable"));

       WebElement droppHere = driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);
        Thread.sleep(2000);

        actions.dragAndDrop(dragMe,droppHere).perform();

        String actualResult = driver.findElement(By.xpath("(//div[@id='droppable']//p)[1]")).getText();
/*
        WebElement a = driver.findElement(By.xpath("(//div[@id='droppable']//p)[1]"));
        String actualResult2 = a.getText();
*/
        String expectedResult = "Dropped!";

        Assert.assertEquals(actualResult,expectedResult,"islem dogru");

    }




}
