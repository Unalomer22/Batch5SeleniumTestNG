package com.eurotech.test.day04_basics_locators;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

    public static void main(String[] args) throws InterruptedException {

        Faker faker = new Faker();

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
                String fakeName = faker.name().firstName();
        String fakeEmail = faker.medical().hospitalName();
        WebElement inputUserNAme= driver.findElement(By.id("userName"));
        inputUserNAme.sendKeys(faker.name().firstName());

        WebElement userEmail = driver.findElement(By.id("userEmail"));
        userEmail.sendKeys(faker.internet().emailAddress());

        WebElement userPass = driver.findElement(By.id(""));

        Thread.sleep(3000);





    }





}
