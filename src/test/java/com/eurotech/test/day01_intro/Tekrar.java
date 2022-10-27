package com.eurotech.test.day01_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tekrar {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com/");

        Thread.sleep(5000);// Sayfayi istedigimiz süre acik bekletebiliriz ,milisaniye olarak

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "www.youtube.com";

        if(actualURL.contains("youtube")){
            System.out.println("PASS");
        }else{
            System.out.println("FAILED");
        }

        driver.navigate().to("https://www.amazon.com");

        driver.navigate().refresh(); //calistigimiz browser’i refresh yapar (yeniler)

        Thread.sleep(5000);// Sayfayi istedigimiz süre acik bekletebiliriz ,milisaniye olarak

        //driver.navigate().to("https://www.youtube.com/");

        driver.navigate().back();

        Thread.sleep(3000);// Sayfayi istedigimiz süre acik bekletebiliriz ,milisaniye olarak

        driver.navigate().forward();
        Thread.sleep(3000);// Sayfayi istedigimiz süre acik bekletebiliriz ,milisaniye olarak

        driver.manage().window().maximize(); // calistigimiz browser’i tam sayfa yapar

        // Sayfa basliginin (title) "google" oldugunu dogrulayin(verify)
        String actualTitle = driver.getTitle();
        String expectedTitle = "Amazon";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Page Title testi PASS");
        }else{
            System.out.println("Page Title testi FAILED");
            System.out.println("Actual Page Title : " + actualTitle);
        }
        Thread.sleep(3000);// Sayfayi istedigimiz süre acik bekletebiliriz ,milisaniye olarak
        driver.close();
    }

}
