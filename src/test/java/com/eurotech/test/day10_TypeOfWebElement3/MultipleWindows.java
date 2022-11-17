package com.eurotech.test.day10_TypeOfWebElement3;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MultipleWindows {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        //driver.close();
       // driver.quit();
    }

    @Test
    public void twoWindows() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/windows");
        Thread.sleep(2000);

        String titleBeforeClick = driver.getTitle();
        System.out.println("titleBeforeClick = " + titleBeforeClick);
        Thread.sleep(2000);

        WebElement click_here = driver.findElement(By.linkText("Click Here"));
        click_here.click();

        Thread.sleep(2000);

        String titleAfterClick = driver.getTitle();
        System.out.println("titleAfterClick = " + titleAfterClick);

    }

    @Test
    public void multipleWindows(){

        driver.get("https://the-internet.herokuapp.com/windows");

        System.out.println("driver.getTitle() = " + driver.getTitle());

        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());

        WebElement click_here = driver.findElement(By.linkText("Click Here"));
        click_here.click();
        click_here.click();
        click_here.click();
        click_here.click();

        Set<String> windowHandles = driver.getWindowHandles();

        for (String tab : windowHandles) {
            driver.switchTo().window(tab);
            //if(driver.getTitle().equals("New Window")){
            if(driver.getCurrentUrl().equals("https://the-internet.herokuapp.com/windows/new")){
                break;
            }

        }

        System.out.println("driver.getTitle() = " + driver.getTitle());

        /*
        No Such Element Exception
1- Locator might be wrong or dynamic or not correct
2- Not enough wait time
3- There is a frame or iframe
         */

    }
}
