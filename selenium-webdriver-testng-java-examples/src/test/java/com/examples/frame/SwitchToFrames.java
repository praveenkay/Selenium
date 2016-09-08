package com.examples.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Praveen Kothapally.
 */
public class SwitchToFrames {


    private static final String BASE_URL = "URL";
    private WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }


    @Test
    public void testSwitchToFrames() throws Exception {
        driver.get(BASE_URL);
        driver.switchTo().frame("classFrame");
        driver.findElement(By.linkText("Deprecated")).click();
        Thread.sleep(2000);
    }


    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
