package com.examples.popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Praveen Kothapally.
 */
public class AlertExample {

    private static   final String BASE_URL="URL";
    private WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testAlert() throws Exception{
        driver.get(BASE_URL);
        driver.findElement(By.id("btnAlert")).click();
        Thread.sleep(2000);
        System.out.println("Alert message " + driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
    }


    @Test
    public void testAlert2(){
        driver.get(BASE_URL);
        driver.findElement(By.id("btnAlert")).click();
        PopupManager.closePopup(driver);
    }



    @AfterTest
    public void afterTest(){
        driver.quit();
    }

}
