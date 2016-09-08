package com.examples.browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Praveen Kothapally.
 */
public class FirefoxDriverExample {


    private static   final String BASE_URL="URL";
    private WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


    }


    @Test
    public void testFirefoxDriver(){

        driver.get(BASE_URL);
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin");
        driver.findElement(By.id("btnLogin")).click();
        Assert.assertEquals(driver.findElement(By.id("welcome")).getText(),"Welcome Admin");


    }

    @AfterTest
    public void afterTest(){
        driver.quit();
    }

}
