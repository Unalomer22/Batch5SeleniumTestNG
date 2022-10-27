package com.eurotech.test.day02_webdriver_basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        //driver.navigate().to("https://www.google.com/");
        driver.get("https://www.google.com/");
        Thread.sleep(2000);

        driver.navigate().to("https://www.facebook.com");
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.navigate().back();

        driver.navigate().forward();
        driver.manage().window().maximize();


        //driver.close();
    }
}
