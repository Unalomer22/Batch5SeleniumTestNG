package com.eurotech.test.day04_basics_locators;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkTextAndPartialLinkText {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://the-internet.herokuapp.com/dynamic_loading");

        WebElement example1 = driver.findElement(By.linkText("Example 1: Element on page that is hidden"));
        example1.click();

        String actualText = driver.findElement(By.tagName("h4")).getText();

        String expectedText = "Example 1: Element on page that is hidden";

        if(actualText.contains(expectedText)){
            System.out.println("Pass");
        }else{
            System.out.println("False");
        }

        Thread.sleep(2000);

        //driver.navigate().back();
        driver.findElement(By.partialLinkText("Example 2:"));

    }
}
