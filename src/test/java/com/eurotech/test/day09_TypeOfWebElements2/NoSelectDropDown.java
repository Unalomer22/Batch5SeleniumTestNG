package com.eurotech.test.day09_TypeOfWebElements2;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class NoSelectDropDown {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test1() throws InterruptedException {

        driver.get("https://demo.aspnetawesome.com/");

        WebElement papayaDropdown=driver.findElement(By.xpath("(//div[text()='Papaya'])[1]"));

        //click dropdown to see available options
        Thread.sleep(2000);
        papayaDropdown.click();

        //get the options with findelements method and finding common locator between then
        List<WebElement> papayaList = driver.findElements(By.xpath("(//ul[@class='o-mnits'])[10]/li"));

        System.out.println("papayaList.size() = " + papayaList.size());// 5


        Assert.assertEquals(papayaList.size(),5); // --> shot way


        //Task
        // index and click()

        // print then one by one
        for (WebElement papaya : papayaList) {
            System.out.println("papaya.getText() = " + papaya.getText());
        }

        Assert.assertEquals(papayaList.get(3).getText(),"Nuts");


        papayaList.get(2).click();
        System.out.println("papayaList.get(2) = " + papayaList.get(2).getText());// papayaList.get(2) = Vegetables

        Thread.sleep(1000);

    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
