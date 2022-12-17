package com.inetbanking.roughCode;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Selenium4 {

    public static void main(String[] args) {

        ChromeDriver driver=new ChromeDriver();
        driver.findElement(RelativeLocator.with(By.id("id")).above(By.id("id")));

    }
}
