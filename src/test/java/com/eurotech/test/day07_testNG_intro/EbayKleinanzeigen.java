package com.eurotech.test.day07_testNG_intro;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EbayKleinanzeigen {

    WebDriver driver = WebDriverFactory.getDriver("chrome");

    @Test
    public void test1(){
        driver.get("https://www.ebay-kleinanzeigen.de/");

      //  WebElement cerezBtn = driver.findElement(By.);
       // cerezBtn.click();
    }
}
