package com.examples.window;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Praveen Kothapally.
 */
public class SetPositionOfTheBrowserWindowExample {


    public static void main(String[] args) throws Exception{

        Point point = new Point(100, 200);
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().setPosition(point);

        Thread.sleep(2000);

        int newX=driver.manage().window().getPosition().getX() + 100;
        int newY =driver.manage().window().getPosition().getY() + 100;
        driver.manage().window().setPosition(new Point(newX, newY));

        driver.quit();
    }


}
