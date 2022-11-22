package com.eurotech.test.day12_ActionJS;

import com.eurotech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FileUpload {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WebDriverWait wait=new WebDriverWait(driver,15);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(4000);
        driver.close();
    }

    @Test
    public void fileUploadTest1(){
        driver.get("https://the-internet.herokuapp.com/upload");

        WebElement chooseFile = driver.findElement(By.cssSelector("#file-upload"));

        chooseFile.sendKeys("C:/Users/User/Desktop/EurotechB5.txt");

        driver.findElement(By.id("file-submit")).click();

        String actualText = driver.findElement(By.id("uploaded-files")).getText();
        Assert.assertEquals(actualText, "EurotechB5.txt");
       // "C:\Users\User\Desktop\EurotechB5.txt"
    }

    @Test
    public void fileUploadTest2(){

        System.out.println("System.getProperty(\"user.dir\") = " + System.getProperty("user.dir"));
                            // C:\Users\User\IdeaProjects\ETS_B5TestNGSelenium
        System.out.println("System.getProperty(\"user.dir\") = " + System.getProperty("os.name"));//  Windows 11
        System.out.println("System.getenv(\"Path\") = " + System.getenv("Path"));

        driver.get("https://the-internet.herokuapp.com/upload");

        WebElement chooseFile = driver.findElement(By.cssSelector("#file-upload"));

        String projectPath = System.getProperty("user.dir");

        String filePath="src/test/resources/EurotechB5.txt";

        String fullPath=projectPath+"/"+filePath;
        System.out.println("fullPath = " + fullPath);

        chooseFile.sendKeys(fullPath);
        driver.findElement(By.id("file-submit")).click();

        String actualText = driver.findElement(By.id("uploaded-files")).getText();
        Assert.assertEquals(actualText, "EurotechB5.txt");

    }

}
