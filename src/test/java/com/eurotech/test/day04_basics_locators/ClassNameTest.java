package com.eurotech.test.day04_basics_locators;

import com.eurotech.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.naming.ldap.BasicControl;

public class ClassNameTest { // Class name icinde bosluk olmamali isim kontrol edilirken
    public static void main(String[] args) throws InterruptedException {
        Faker faker = new Faker();

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://eurotech.study/login");

        WebElement understandBtn = driver.findElement(By.id("rcc-confirm-button"));
        understandBtn.click();

        WebElement emailInputBox = driver.findElement(By.name("email"));
        emailInputBox.sendKeys("eurotechB5@gmail.com");

        WebElement passwordInputBox = driver.findElement(By.name("password"));
        passwordInputBox.sendKeys("Test12345");

        driver.findElement(By.id("loginpage-form-btn")).click();

        Thread.sleep(2000);

        WebElement experienceText = driver.findElement(By.className("my-2"));
        System.out.println("experienceText.getText() = " + experienceText.getText());

        System.out.println("driver.findElement(By.className(\"navbar bg-dark\")).getText() = " + driver.findElement(By.className("navbar bg-dark")).getText());
        // navbar bg-dark : class name icinde kelimeler arasinda bosluk varsa classname methodu hata verir
        //driver.close();







    }
}
