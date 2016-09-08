package com.examples.screens;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;


public class TakeScreens {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new FirefoxDriver();
        driver.get("<API URL PATH IF ANY>");
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("c:\\temp\\screenshot.png"));

    }
}
