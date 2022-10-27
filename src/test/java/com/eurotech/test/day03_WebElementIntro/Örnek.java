package com.eurotech.test.day03_WebElementIntro;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Örnek {
    public static void main(String[] args) throws InterruptedException {
      /*  -open chrome browser
        -go to https://www.amazon.com
        -enter 'Java' in the search button
        -click on search  button
                -verify that title has changed
      */

        //open chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //-go to https://www.amazon.com
         driver.get("https://www.amazon.com");

        //-enter 'Java' in the search button
        WebElement searchBtn = driver.findElement(By.id("twotabsearchtextbox"));
        searchBtn.sendKeys("Java");
        searchBtn.click();

        driver.findElement(By.id("nav-search-submit-button")).click();

        driver.manage().window().maximize();

        String expectedTitle = "Amazon.com : Java";
        String actualTitle = driver.getTitle();

        System.out.println("actualTitle = " + actualTitle);

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Page Title testi PASS");
        }else{
            System.out.println("Page Title testi FAILED");
            System.out.println("Actual Page Title : " + actualTitle);
        }

        Thread.sleep(3000);
        driver.close();

    }
}
