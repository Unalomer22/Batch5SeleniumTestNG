package com.eurotech.test.day10_TypeOfWebElement3;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PopUps {

    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
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
/*
        //verify that confirm is accepted
        String expectedMesssage="You have accepted";
        WebElement actualMessage = driver.findElement(By.xpath("//p[text()='You have accepted']"));

        Assert.assertEquals(actualMessage.getText(),expectedMesssage);
*/
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        // driver.quit();
    }

}
