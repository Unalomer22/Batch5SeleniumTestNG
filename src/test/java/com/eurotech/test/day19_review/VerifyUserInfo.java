package com.eurotech.test.day19_review;

import com.eurotech.pages.ToolsQALoginPage;
import com.eurotech.test.TestBase;
import com.eurotech.utilities.BrowserUtils;
import com.eurotech.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyUserInfo extends TestBase {
    /*
    -Test1
    -Create new User

    -Test2
    -Login as anew user
    verify that login is successful
    -click on go to Book store
    -verify that went book store
    -Search"Add Osmani" in search button
     */

    @Test
    public void newUserCreate(){

        ToolsQALoginPage toolsQALoginPage=new ToolsQALoginPage();

        extentLogger=report.createTest("User crate info verification");

        extentLogger.info("click on vew User button");
        toolsQALoginPage.newUserBtn.click();

        extentLogger.info("Enter first name");
        toolsQALoginPage.firstNameInput.sendKeys("Euro");

        extentLogger.info("Enter last name");
        toolsQALoginPage.lastNameInput.sendKeys("tech");

        extentLogger.info("Enter UserName");
        toolsQALoginPage.userNameInput.sendKeys("Eurotech");

        extentLogger.info("Enter password");
        toolsQALoginPage.passwordInput.sendKeys("Eurotech12!");

        extentLogger.info("click on the I'm not robot");
        // Captcha s can NOT be located
        toolsQALoginPage.ImNotRobotBtn.click();

        extentLogger.info("click on the register");
        toolsQALoginPage.registerBtn.click();

    }

    @Test
    public void loginInfo() {
        ToolsQALoginPage toolsQALoginPage=new ToolsQALoginPage();
        extentLogger=report.createTest("user info verification");

        extentLogger.info("Enter User Name");
        toolsQALoginPage.userNameInput.sendKeys(ConfigurationReader.get("userToolsQA"));

        extentLogger.info("Enter password ");
        toolsQALoginPage.passwordLoginInput.sendKeys(ConfigurationReader.get("passwordToolsQA"));

        extentLogger.info("click on the login button");
        toolsQALoginPage.loginBtn.click();


        //1.way
        extentLogger.info("verify that login is successful");
        String expectedUrl="https://demoqa.com/profile";
        BrowserUtils.waitFor(2);
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);

        //2.way
        String expectedVerifyMessage="Eurotech";
        extentLogger.info("verify that login is successful in Profile " + expectedVerifyMessage);
        String actualVerifyUser=toolsQALoginPage.verifyUserName.getText();
        Assert.assertEquals(actualVerifyUser,expectedVerifyMessage);

        extentLogger.info("click on the Go To Store button");
        actions.moveToElement(toolsQALoginPage.goToStoreBtn).click();
        //BrowserUtils.clickWithJS(toolsQALoginPage.goToStoreBtn);
        // toolsQALoginPage.goToStoreBtn.click();

        extentLogger.info("Enter search button 'Addy Osmani' ");
        toolsQALoginPage.typeTosearchBtn.sendKeys("Addy Osmani");

        extentLogger.info("PASSS");

    }
}
