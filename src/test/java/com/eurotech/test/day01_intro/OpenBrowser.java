package com.eurotech.test.day01_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenBrowser {

    public static void main(String[] args) throws InterruptedException {


        // We have to enter this line every time we want to open chrome/firefox/safari......
        WebDriverManager.chromedriver().setup();

        // Webdriver represent the browser
        // we are creating driver for chrome browser

        WebDriver driver = new ChromeDriver();// polymorphism

        //WebDriverManager.edgedriver().setup();

        //WebDriver driver = new EdgeDriver();
        driver.get("https://www.eurotechstudy.com");

        // Eurotech sayfasina gidelim
        driver.navigate().to("https://www.amazon.com");

        driver.navigate().refresh(); //calistigimiz browser’i refresh yapar (yeniler)

        driver.navigate().back();  // navigate() ile geldigimiz bir onceki sayfaya gider

        driver.navigate().forward(); // navigate() ile gidip geri dondugumuz sayfaya yeniden gider

        driver.manage().window().maximize(); // calistigimiz browser’i tam sayfa yapar

        Thread.sleep(5000);// Sayfayi istedigimiz süre acik bekletebiliriz ,milisaniye olarak

        driver.close();//  sadece calisilan browser'i kapatir
/*
    1-  driver.get("https://www.youtube.com"); istediğimiz web sayfasına gider.

        driver.navigate().to("https://www.google.com/"); istediğimiz web sayfasına gider.

        get()’den farkli olarak navigate ile gittigimiz sayfadan back() ve forward() komutlarini
        kullanabiliriz.

        2- driver.quit(); acik olan tum browser'lari kapatir
 */
    }

}
