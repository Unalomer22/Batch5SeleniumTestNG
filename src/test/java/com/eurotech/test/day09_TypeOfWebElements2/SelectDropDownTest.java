package com.eurotech.test.day09_TypeOfWebElements2;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class SelectDropDownTest {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @Test
    public void test1() {
        driver.get("https://demoqa.com/select-menu");
        //1 locate your dropdown just like any other web element with unique locator
        // which has "select" tag name
        List<WebElement> colorDropdown = driver.findElements(By.cssSelector("#oldSelectMenu"));
        System.out.println("colorDropdown.size() = " + colorDropdown.size());
        

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        // driver.quit();
    }
}
