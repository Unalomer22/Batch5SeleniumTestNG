package com.eurotech.test.day08_TypeOfWebElements;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.plaf.TableHeaderUI;
import java.util.concurrent.TimeUnit;

public class CheckBoxDemo2 {

    @Test
    public void test1() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://demoqa.com/automation-practice-form");

        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement sports = driver.findElement(By.cssSelector("[id='hobbies-checkbox-1']"));
        Assert.assertFalse(sports.isSelected());// assert: false, condition : false, test : Pass

        WebElement reading = driver.findElement(By.cssSelector("[id='hobbies-checkbox-2']"));
        Assert.assertFalse(reading.isSelected());// assert: false, condition : false, test : Pass

        WebElement music = driver.findElement(By.cssSelector("[id='hobbies-checkbox-3']"));
        Assert.assertFalse(music.isSelected());// assert: false, condition : false, test : Pass

        /*
        - Class Task
        complete the task
        click all the checkbox
        than assert that is selected or not
*/
       WebElement sportCheckBox = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
       Thread.sleep(2000);
       sportCheckBox.click();
       Thread.sleep(3000);

       Assert.assertFalse(sportCheckBox.isSelected(), "verify that sports is selected");


    }

    @Test
    public void test2() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        WebElement checkBox2 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
        WebElement checkBox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));

        Assert.assertTrue(checkBox2.isSelected(), "verify that checkBox 2  is selected");
        Assert.assertFalse(checkBox1.isSelected(), "verify that checkBox 1  is selected");

        Thread.sleep(3000);

        driver.close();
    }

    @Test
    //CLASS TASK 2

    public void test3() throws InterruptedException {

        //https://the-internet.herokuapp.com/dynamic_loading
        //Homework
        //Example 2: Element rendered after the fact -->click
        //click that element
        //verify that hello world is not displayed
        //click start button
        //verify that hello element is displayed
        //and verify that "Hello World!" text is present

        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        WebElement startButton = driver.findElement(By.cssSelector("#start>button"));

        startButton.click();
        Thread.sleep(6000);


        WebElement hello = driver.findElement(By.xpath("//*[text()='Hello World!']"));

        //Assert.assertFalse(hello.isDisplayed(),"Verify that element is NOT displayed");

        Assert.assertTrue(hello.isDisplayed(),"verify that element is displayed");

        driver.close();


    }
}