package com.eurotech.test.day08_TypeOfWebElements;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxDemo {

    @Test
    public void test1() {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
       // driver.get("https://the-internet.herokuapp.com/checkboxes");
        driver.get("https://demoqa.com/automation-practice-form");

        WebElement checkBox2 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
        WebElement checkBox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));

        Assert.assertTrue(checkBox2.isSelected(), "verify that checkbox 2 is selected");
        Assert.assertFalse(checkBox1.isSelected(), "verify that checkbox 1 is NOT selected");

        checkBox1.click();

        driver.close();

    }
}