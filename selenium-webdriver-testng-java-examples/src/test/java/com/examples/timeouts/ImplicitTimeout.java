package com.examples.timeouts;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Praveen Kothapally.
 */
public class ImplicitTimeout {


    public static void main(String[] args) {


        WebDriver driver = new FirefoxDriver();

        /**
         *         Specifies the amount of time the driver should wait when searching for an element
         *         if it is not immediately present.         */
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.quit();
    }

}
