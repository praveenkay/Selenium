package com.examples.window;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Praveen Kothapally.
 */
public class ResizeTheBrowserWindowExample {


    public static void main(String[] args) {

        Dimension dimension = new Dimension(300, 400);
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().setSize(dimension);

        int newHeight = driver.manage().window().getSize().getHeight()/2;
        int newWidth = driver.manage().window().getSize().getWidth()/2;
        driver.manage().window().setSize(new Dimension(newHeight, newWidth));


        driver.quit();
    }


}
