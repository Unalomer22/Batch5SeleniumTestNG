package com.eurotech.test.day01_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitleAndURL {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
    // Google anasayfasina gidelim  https://www.google.com/
        driver.get("https://www.google.com/");

        // Sayfa basliginin (title) "google" oldugunu dogrulayin(verify)
        String actualResult = driver.getTitle();
        String expectedResult = "Google";

        if(actualResult.equals(expectedResult)){
            System.out.println("Page Title testi PASS");
        }else{
            System.out.println("Page Title testi FAILED");
            System.out.println("Actual Page Title : " + actualResult);
        }

        driver.close();

    }


}
