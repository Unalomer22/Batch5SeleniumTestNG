package com.eurotech.test.day02_webdriver_basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndGetUrl {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

       // driver.get("https://www.eurotechstudy.com");
        driver.get("https://tr-tr.facebook.com/");

        // Sayfa basliginin (title) ""https://tr-tr.facebook.com/"" oldugunu dogrulayin(verify)
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        String expectedTitle = "https://tr-tr.facebook.com/";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Page Title testi PASS");
        }else{
            System.out.println("Page Title testi FAILED");
            System.out.println("Actual Page Title : " + actualTitle);
        }

        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource);
    }

}
