package com.eurotech.test.day05_xpath_locator;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BekirBaba01 {
    /*
1.Bir class oluşturun : Bekirbabatest01
2. Gerekli yapiyi olusturun ve aşağıdaki görevi tamamlayın.
- https://www.facebook.com adresine gidin
 - “Create an Account” button’una basin
- “radio buttons” elementlerini locate edin
- Secili degilse cinsiyet butonundan size uygun olani secin
 */

    WebDriver driver = WebDriverFactory.getDriver("chrome");
    @Test
    public void test1(){
        driver.get("https://www.facebook.com");
        WebElement cerezBtn = driver.findElement(By.id("u_0_d_Mt"));
        cerezBtn.click();
    }



}
