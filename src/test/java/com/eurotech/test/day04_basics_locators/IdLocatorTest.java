package com.eurotech.test.day04_basics_locators;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IdLocatorTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://demoqa.com/text-box");

        WebElement inputUserName=driver.findElement(By.id("userName"));

        inputUserName.sendKeys("Mike");

        Thread.sleep(3000);

        WebElement inputUserEmail = driver.findElement(By.id("userEmail"));
        inputUserName.sendKeys("mike@gmail.com");

        Thread.sleep(3000);



    }


}
