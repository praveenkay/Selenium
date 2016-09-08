package com.examples.popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Praveen Kothapally.
 */
public class ConfirmationWindowExample {


    private static   final String BASE_URL="URL";
    private WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Test
    public void testConfirmationAccept(){
        driver.get(BASE_URL);
        driver.findElement(By.xpath("//input[@id='btnConfirm']")).click();
        driver.switchTo().alert().accept();
        Assert.assertEquals(driver.findElement(By.id("output")).getText(),"Confirmed.");
    }
    @Test
    public void testConfirmationReject(){
        driver.get(BASE_URL);
        driver.findElement(By.xpath("//input[@id='btnConfirm']")).click();
        driver.switchTo().alert().dismiss();
        Assert.assertEquals(driver.findElement(By.id("output")).getText(), "Rejected!");
    }
    @AfterTest
    public void afterTest(){
        driver.quit();
    }

}
