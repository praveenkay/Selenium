package com.examples.popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created by Praveen Kothapally.
 */
public class PopupWindowExample {


    private static final String BASE_URL = "URL";
    private WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }


    @Test
    public void testAccessNewWindos() throws Exception{
        driver.get(BASE_URL);
        driver.findElement(By.linkText("New Window Link")).click();

        Set<String> windowId = driver.getWindowHandles();
        Iterator<String> itererator = windowId.iterator();
        String mainWinID = itererator.next();
        String  newAdwinID = itererator.next();

        driver.switchTo().window(newAdwinID);
        System.out.println(driver.getTitle());
        driver.findElement(By.id("txtName")).sendKeys("Hello Selenium !");
        Thread.sleep(3000);

        driver.switchTo().window(mainWinID);
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
    }

    public void switchToMainWindow(WebDriver driver){
        Set<String> windowId = driver.getWindowHandles();
        Iterator<String> itererator = windowId.iterator();
        String mainWinID = itererator.next();
        driver.switchTo().window(mainWinID);
    }


    public void switchToPopupWindow(WebDriver driver){
        Set<String> windowId = driver.getWindowHandles();
        Iterator<String> itererator = windowId.iterator();
        itererator.next();
        String popupWinID = itererator.next();
        driver.switchTo().window(popupWinID);
    }



    @Test
    public void testAccessNewWindow2() throws Exception{
        String mainWinID = "";    String  newAdwinID="";
        driver.get(BASE_URL);
        mainWinID = driver.getWindowHandle();
        driver.findElement(By.linkText("New Window Link")).click();

        Set<String> windowId = driver.getWindowHandles();    // get  window id of current window
        Iterator<String> itererator = windowId.iterator();
        while (itererator.hasNext()){
            newAdwinID = itererator.next();
        }

        driver.switchTo().window(newAdwinID);
        System.out.println(driver.getTitle());
        driver.findElement(By.id("txtName")).sendKeys("Hello Selenium !");
        Thread.sleep(3000);
        //driver.close();

        driver.switchTo().window(mainWinID);
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
    }


    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
