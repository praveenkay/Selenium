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
public class PromptExample {


    private static final String BASE_URL = "URL";
    private WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


    }


    @Test
    public void testPromptGetMessage() {
        driver.get(BASE_URL);
        driver.findElement(By.id("btnPrompt")).click();
        System.out.println("Message in the prompt " + driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
    }

    @Test
    public void testPromptSetValue() {
        String qaToolName = "Selenium WebDriver";
        driver.get(BASE_URL);
        driver.findElement(By.xpath("//input[@id='btnPrompt']")).click();
        driver.switchTo().alert().sendKeys(qaToolName);
        driver.switchTo().alert().accept();
        Assert.assertEquals(driver.findElement(By.id("output")).getText(), qaToolName);
    }
    @AfterTest
    public void afterTest() {
        driver.quit();
    }

}
