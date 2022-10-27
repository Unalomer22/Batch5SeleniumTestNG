package com.eurotech.test.day01_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitleAndURL02 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        // Youtube anasayfasina gidelim  https://www.youtube.com/
        driver.navigate().to("https://www.youtube.com/");
        driver.manage().window().maximize(); // calistigimiz browser’i tam sayfa yapar

        // Sayfa basliginin (title) "Youtube" oldugunu dogrulayin(verify)
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "www.youtube.com";

        if(actualURL.equals(expectedURL)){
            System.out.println("URL testi PASS");
        }else{
            System.out.println("URL testi FAILED");
            System.out.println("Actual URL : " + actualURL);
        }

    }
}
