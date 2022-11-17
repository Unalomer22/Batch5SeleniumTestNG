package com.eurotech.test.day10_TypeOfWebElement3;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Iframe {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();

    }

    @Test
    public void testName() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/frame");

        // How to switch the Iframe


        // *****  First way : using name or id  *****
        driver.switchTo().frame("mce_0_ifr");

        //driver.findElement(By.cssSelector("#tinymce")).sendKeys("Eurotech Batch 5");

        WebElement textArea = driver.findElement(By.cssSelector("#tinymce"));
        textArea.clear();
        textArea.sendKeys("Eurotech Batch 5 was here");

        driver.switchTo().parentFrame();
        // *****  Second way : switching index

        Thread.sleep(2000);
        driver.switchTo().frame(0);
        textArea.clear();
        textArea.sendKeys("Eurotech Batch 5 was here for the 2nd time");

        Thread.sleep(4000);

        driver.switchTo().parentFrame();

        // *****  Third way : using web element
        WebElement iframe = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(iframe);
        textArea.clear();
        textArea.sendKeys("This is third way");

    }

    @Test
    public void nestedIframe(){

        driver.get("https://the-internet.herokuapp.com/nested_frames");

        // Switch to middle frame and get middlle text
        // we need to go first parent
        driver.switchTo().frame("frame-top");

        driver.switchTo().frame("frame-middle");

        System.out.println("driver.findElement(By.cssSelector(\"#content\")) = " + driver.findElement(By.cssSelector("#content")));

        /*
        go to Right frame and get text
        driver.switchTo().defaultContent();// selenium switch to top
        driver.switchTo().frame("frame-top");
         */
        driver.switchTo().parentFrame();
        driver.switchTo().frame(2);
        System.out.println("driver.findElement(By.tagName(\"body\")).getText() = " + driver.findElement(By.tagName("body")).getText());

        // go to bottom frame and get text


        // go to Left frame and get text
    }

}