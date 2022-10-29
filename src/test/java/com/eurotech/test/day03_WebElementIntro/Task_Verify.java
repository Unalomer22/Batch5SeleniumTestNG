package com.eurotech.test.day03_WebElementIntro;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task_Verify {

    public static void main(String[] args) {

        // 1-open chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        // 2-go to https://www.facebook.com/
        driver.get("https://www.facebook.com/");

        String actualUrl = driver.getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);

        driver.findElement(By.id("u_0_e_Iu")).click();// u_0_e_Iu
        //cerezBtn.click();

        // 3--enter real username
        WebElement emailBtn = driver.findElement(By.id("email"));
        emailBtn.sendKeys("omerunal11@hotmail.com");
        emailBtn.click();
        // 4--enter real password
        WebElement passwordBtn = driver.findElement(By.id("pass"));
        passwordBtn.sendKeys("1619onmh");
        passwordBtn.click();
        // 5-  -click login button
        WebElement loginBtn = driver.findElement(By.id("u_0_5_np"));
        loginBtn.click();

        // 6-  -verify that login successfully


/*


   Task2
   -open chrome browser
   -go to https://www.facebook.com/
   -enter dummy username with using Faker class
   -enter dummy password with using Faker class
   -click login btn
   -veriify that login Failed
 */











    }
}
