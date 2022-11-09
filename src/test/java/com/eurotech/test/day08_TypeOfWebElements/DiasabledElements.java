package com.eurotech.test.day08_TypeOfWebElements;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DiasabledElements {
    /** What is disabled elements?
     * Disable mean means :
     * U can NOT interact the element
     * U can NOT click
     * or
     * U can NOT write something
     *
     */
    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        WebElement diasableElement= driver.findElement(By.cssSelector("#input-example>input"));

        Assert.assertFalse(diasableElement.isEnabled(),"Verify that element is NOT enable or element is disable");

        //if we click the enable button it will be interactive

        WebElement enableButton= driver.findElement(By.cssSelector("#input-example>button"));
        enableButton.click();

        //there is a process and we add wait
        Thread.sleep(4000);

        Assert.assertTrue(diasableElement.isEnabled(),"Verify that element is enable");


        driver.close();


    }








}
