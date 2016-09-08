package com.examples.select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Praveen Kothapally.
 */
public class SelectItemsFromList {


    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("URL");
        driver.findElement(By.cssSelector("#txtUsername")).clear();
        driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
        driver.findElement(By.cssSelector("#txtPassword")).clear();
        driver.findElement(By.cssSelector("#txtPassword")).sendKeys("admin");
        driver.findElement(By.cssSelector("#btnLogin")).click();

    }
}
