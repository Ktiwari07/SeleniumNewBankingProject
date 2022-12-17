package com.inetbanking.PageObjects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import static org.apache.logging.log4j.LogManager.getLogger;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(name="uid")
    WebElement username;
    @FindBy(name="password")
    WebElement password;
    @FindBy(name="btnLogin")
    WebElement submit_button;
    @FindBy(how = How.NAME ,name="btnLogin")
    WebElement b;
    Logger logger= getLogger(LoginPage.class);

    public void setUsername(String uname){
        username.sendKeys(uname);
       logger.info("user named entered now");
    }
    public void setPassword(String pass){
        password.sendKeys(pass);
        logger.info("password is entered now");
    }
    public void clickSubmit() throws InterruptedException {
        submit_button.click();
        logger.info("submit button is clicked now");
    }
}
