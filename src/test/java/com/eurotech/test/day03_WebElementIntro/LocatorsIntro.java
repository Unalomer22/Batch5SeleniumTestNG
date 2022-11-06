package com.eurotech.test.day03_WebElementIntro;

import com.eurotech.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LocatorsIntro {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        Thread.sleep(5000);
        driver.get("http://a.testaddressbook.com");

/*   1.YOL id üzerinden ulasabiliriz
        WebElement signInLinki = driver.findElement(By.id("sign-in"));
        signInLinki.click();


        /iki tane ayni isimde class name oldugu icin hata verdi
        WebElement signInLinki = driver.findElement(By.className("#nav-item nav-link"));
        signInLinki.click();

*/
      //  2. YOL
        WebElement signInLinki = driver.findElement(By.linkText("Sign in"));
        signInLinki.click();

        //Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //Bekleme süresi ayarlamak icin

        WebElement emailTextBox = driver.findElement(By.id("session_email"));
        WebElement passwordTextBox = driver.findElement(By.id("session_password"));
        WebElement signInButonu = driver.findElement(By.name("commit"));

        Thread.sleep(5000);

        emailTextBox.sendKeys("testtechproed@gmail.com");

        Thread.sleep(5000);

        passwordTextBox.sendKeys("Test1234!");

        Thread.sleep(5000);

        signInButonu.click();

        WebElement kullaniciAdi = driver.findElement(By.className("navbar-text"));

        if (kullaniciAdi.isDisplayed()){
            System.out.println("kullanici adi testtechproed@gmail.com PASS");
        }else {
            System.out.println("kullanici adi testtechproed@gmail.com FAILED");
        }


        if (kullaniciAdi.equals("testtechproed@gmail.com")){
            System.out.println("kullanici adi testtechproed@gmail.com PASS");
        }else {
            System.out.println("kullanici adi testtechproed@gmail.com FAILED");
        }




    }
}
