package com.eurotech.test.day13_webTables;

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

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HoverTask {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void hoverTask() throws InterruptedException {

        /** class Task
         *
         *                 go to https://the-internet.herokuapp.com/hovers url
         *                 and get "view profile" elements' text (all of them)
         *                 and verify element is displayed (one by one)
         *
         *                 hind: Use list and for loop
         */

        driver.get("https://the-internet.herokuapp.com/hovers");

        driver.findElement(By.xpath("(//img)[2]"));// text ve index oldugunda xpath kullaniyoruz

        List<WebElement> imgList = driver.findElements(By.tagName("img"));
        // img size: 4

        for (int i = 2; i <= ((List<?>) imgList).size(); i++) {

            String imgXpath="(//img)["+i+"]";
            System.out.println("imgXpath = " + imgXpath);

            WebElement img = driver.findElement(By.xpath(imgXpath));

            Actions actions=new Actions(driver);
            Thread.sleep(1000);

            actions.moveToElement(img).perform();

            // if I use --> //h5[text()='name: user1']"  ==> user1
            // if I use --> //h5[text()='name: user"+i+"']"  ==> user2
            String textPath="//h5[text()='name: user"+(i-1)+"']";  //-> it is dynamic and ı can get all

            WebElement text = driver.findElement(By.xpath(textPath));

            System.out.println("textPath = " + textPath);

            Assert.assertTrue(text.isDisplayed(),"Verify that user "+(i-1)+" is displayed");

            System.out.println("Verify that user " + (i - 1) + " is displayed");

        }

    }








}
