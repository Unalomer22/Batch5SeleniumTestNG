package com.eurotech.test.day10_TypeOfWebElement3;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PopUps {

    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void PopUpHtml() throws InterruptedException {

        driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml?jfwid=b656a");

        // click the confirm button
        driver.findElement(By.xpath("(//span[text()='Confirm'])[1]")).click();
        Thread.sleep(3000);
        // click pop ups - yes
        driver.findElement(By.xpath("(//span[text()='Yes'])[2]")).click();

        Thread.sleep(2000);

        //verify that confirm is accepted
        String expectedMesssage = "You have accepted";
        WebElement actualMessage = driver.findElement(By.xpath("//p[text()='You have accepted']"));

        Assert.assertEquals(actualMessage.getText(), expectedMesssage);
    }
        @Test
        public void jsAlerts() throws InterruptedException {

            driver.get("https://the-internet.herokuapp.com/javascript_alerts");
            Thread.sleep(2000);

            //click -> Click for JS Alert Button
            driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

            //e.g.: 1 switch to JS alert popUp
            Alert alert=driver.switchTo().alert();
            Thread.sleep(2000);
            //click to OK
            alert.accept();
            Thread.sleep(1000);


            //e.g.: 2 Click For JS Confirm

            driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
            Thread.sleep(2000);

            //click to cancel
            alert.dismiss();
            Thread.sleep(1000);

            //e.g.: 3 click -> Click For JS Prompt
            driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
            Thread.sleep(2000);

            //send keys to JS prompt
            alert.sendKeys("Eurotech Batch 5");

            // to get text from pop up
            System.out.println("alert.getText() = " + alert.getText());// alert.getText() = I am a JS prompt
            Thread.sleep(2000);

            alert.accept();
            Thread.sleep(3000);
        }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        // driver.quit();
    }

}
