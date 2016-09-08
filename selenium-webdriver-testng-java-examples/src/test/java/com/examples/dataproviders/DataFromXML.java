package com.examples.dataproviders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by Praveen Kothapally.
 */
public class DataFromXML {

    private WebDriver webDriver;

    @BeforeSuite
    @Parameters({"browser"})
    public void beforeSuite(String browser){


        if(browser.equalsIgnoreCase("firefox")){
            webDriver = new FirefoxDriver();
        }else if (browser.equalsIgnoreCase("chrome")){

            webDriver = new ChromeDriver();
        }
    }


    //Parameters from XML
    @Test
    @Parameters({"username","password"})
    public void testUserLogin(String username, String password){
        System.out.println(" " + username);
        System.out.println(" " + password);
    }


    //Optional parameters
    @Test
    @Parameters({"username","password"})
    public void testUserLoginWithOptionalParameters(@Optional("Admin2") String username2, String password){
        System.out.println(" " + username2);
        System.out.println(" " + password);
    }


}
