package com.eurotech.test.day02_webdriver_basic;

import com.eurotech.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CallWebDriverFactory {
    public static void main(String[] args) {

       WebDriver driver =  WebDriverFactory.getDriver("Chrome");

/*
       driver.get("https://www.facebook.com");

        driver.close();
*/
        //WebDriverManager.chromedriver().setup();

       // WebDriver driver = new ChromeDriver();
        // Google anasayfasina gidelim  https://www.google.com/
        driver.get("http://eurotech.study/");


        String actualResult = driver.getTitle();
        String expectedResult = "DevEX";

        if(actualResult.equals(expectedResult)){
            System.out.println("Page Title testi PASS");
        }else{
            System.out.println("Page Title testi FAILED");
            System.out.println("Actual Page Title : " + actualResult);
        }

       driver.close();

    }



    }




