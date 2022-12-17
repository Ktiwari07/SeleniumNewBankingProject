package com.inetbanking.TestCases;
import org.openqa.selenium.chrome.ChromeOptions;

import com.inetbanking.Utilities.ReadConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class BaseClass {

   /* public static WebDriver driver;
    public String baseURL="https://demo.guru99.com/v3/index.php";
    public  String username="mngr462594";
    public String password="ydadAvU";*/

    public WebDriver driver;



    public String baseURL;
    public String username;
    public ReadConfig config;
    public String password;

    @BeforeTest
    public void init(){

    }
    @BeforeClass
    public void setup(){
        config=new ReadConfig();
        password=config.getPassword();
        username=config.getUsername();
        baseURL=config.getApplicationUrl();
        /*ChromeOptions option=  new ChromeOptions();
        option.addArguments("--headless");*/

        driver=new ChromeDriver();
    }
    @AfterClass
    public void TearDown(){
        driver.quit();
    }
}
