package com.inetbanking.TestCases;

import com.inetbanking.PageObjects.LoginPage;


import org.apache.logging.log4j.Logger;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.apache.logging.log4j.LogManager.getLogger;

public class TC_LoginTest_001 extends BaseClass
{

    @Test
    public void LoginTest() throws Exception{
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Logger logger= getLogger(LoginPage.class);
        driver.get(baseURL);
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.manage().window().maximize();
        LoginPage login=new LoginPage(driver);
        logger.info("driver instance created");
        login.setUsername(username);
        login.setPassword(password);
        login.clickSubmit();
        if((driver.getTitle()).contains("Guru99")){
            Assert.assertTrue(true);
            logger.info("Title condition passed");
        }
        else {
            Assert.assertTrue(false);
            logger.info("Condition for Title is failed");
        }

    }


}
