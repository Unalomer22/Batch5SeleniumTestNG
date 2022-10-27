package com.eurotech.test.day03_WebElementIntro;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyUrlChange {
    public static void main(String[] args) throws InterruptedException {

        //open chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //go to http://eurotech.study/login

        driver.get("http://eurotech.study/login");

        Thread.sleep(5000);

        driver.findElement(By.id("rcc-confirm-button")).click();

        driver.findElement(By.id("loginpage-input-email"));

        WebElement emailInputBtn = driver.findElement(By.id("loginpage-input-email"));

        emailInputBtn.sendKeys("eurotech@gmail.com");
        String password = "Test12345!";
        WebElement passwordInputBtn = driver.findElement(By.id("loginpage-form-pw-input"));
        passwordInputBtn.sendKeys(password);

        WebElement loginBtn = driver.findElement(By.id("loginpage-form-btn"));

        loginBtn.click();

        Thread.sleep(3000);
        String expectedUrl = "http://eurotech.study/dashboard";
        String actualUrl = driver.getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);

        if(expectedUrl.equals(actualUrl)){
            System.out.println("Pass");
        }else {
            System.out.println("Failed");
        }

        driver.close();
        // enter email as 'eurotech@gmail.com'
        //enter password as 'Test12345!'
        //click login btn
        //verify that url has changed



    }

}
