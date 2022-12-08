package com.eurotech.pages;

import com.eurotech.test.TestBase;
import com.eurotech.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SauceDemoLoginPage extends TestBase {

    @FindBy(id = "user-name")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id= "login-button")
    public WebElement loginBtn;

    @FindBy(xpath="//form/div[3]/h3")
    public WebElement errorMessage;

    @FindBy(xpath = "//span[text()='Products']")
    public WebElement productsText;

    @FindBy(xpath = "//form/div")
    public List<WebElement> listElements;

    @FindAll({
            @FindBy(id = "user-name"),
            @FindBy(name = "user-name")
    })
    public WebElement getUsernameInput;

    @FindBys({
            @FindBy(xpath = "//input[@type='text']"),
            @FindBy(id = "password")
    })
    public WebElement getPasswordInput;

    public void login01(){
        String asd = "qwe";

        usernameInput.sendKeys(ConfigurationReader.get("userswag"));
        passwordInput.sendKeys(ConfigurationReader.get("passwordswag"));
        loginBtn.click();

    }
    public void loginAsPerform(){
        String username=ConfigurationReader.get("userPerform");
        String password=ConfigurationReader.get("passwordswag");
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();

    }

    public void loginAsProblem(){
        String username=ConfigurationReader.get("userProblem");
        String password=ConfigurationReader.get("passwordswag");
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();

    }
    @Test
    public void login() {
        driver.get(ConfigurationReader.get("url1"));
        usernameInput.sendKeys(ConfigurationReader.get("userswag"));
        passwordInput.sendKeys(ConfigurationReader.get("passwordswag"));
        loginBtn.click();

        Assert.assertEquals(productsText.getText(),"PRODUCTS");

    }

    @Test
    public void loginWithMethod() {
        driver.get(ConfigurationReader.get("url1"));
        login();

        Assert.assertEquals(productsText.getText(),"PRODUCTS");
    }

    @Test
    public void loginAsPerform02() {
        driver.get(ConfigurationReader.get("url1"));

        loginAsPerform();

        String actualUrl=driver.getCurrentUrl();

        Assert.assertEquals(actualUrl,"https://www.saucedemo.com/inventory.html");

    }

    @Test
    public void loginAsProblemMethod() {
        driver.get(ConfigurationReader.get("url1"));

        loginAsProblem();

        Assert.assertEquals(productsText.getText(),"PRODUCTS");

    }

}
