package com.examples.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Praveen.
 */
public class MultipleActionsExample {

    private static   final String BASE_URL="URL";
    private WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


    }


    @Test
    public void testFirefoxDriver() throws Exception{

        driver.get(BASE_URL);
        WebElement txtUsername = driver.findElement(By.id("txtUsername"));

        Actions builder = new Actions(driver);
        Action seriesOfActions = builder
                .moveToElement(txtUsername)
                .keyDown(txtUsername, Keys.SHIFT)
                .sendKeys(txtUsername, "admin")
                .keyUp(txtUsername, Keys.SHIFT)
                .build();
        seriesOfActions.perform();

        driver.findElement(By.id("txtPassword")).sendKeys("admin");





    }

    @AfterTest
    public void afterTest(){
        driver.quit();
    }

}
