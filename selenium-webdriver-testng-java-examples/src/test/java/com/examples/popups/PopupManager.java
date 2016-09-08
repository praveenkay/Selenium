package com.examples.popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.security.Credentials;

import java.util.Iterator;
import java.util.Set;

/**
 * Created by Praveen Kothapally.
 */
public class PopupManager {


    public static void closePopup(WebDriver driver){
            driver.switchTo().alert().accept();
    }


    public static String getPopupMessage(WebDriver driver){
        return  driver.switchTo().alert().getText();
    }


    public static void typeInPrompt(WebDriver driver, String message){
        driver.switchTo().alert().sendKeys(message);
    }


    public static void cancelPopup(WebDriver driver){
        driver.switchTo().alert().dismiss();
    }



    public void switchToMainWindow(WebDriver driver){
        Set<String> windowId = driver.getWindowHandles();
        Iterator<String> itererator = windowId.iterator();
        String mainWinID = itererator.next();
        driver.switchTo().window(mainWinID);
    }


    public void switchToPopupWindow(WebDriver driver){


        for (String windowID : driver.getWindowHandles()){
            driver.switchTo().window(windowID);
        }
    }



}
