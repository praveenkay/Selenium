package com.examples.testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * Created by Praveen Kothapally.
 */
public class Base {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("I am in before suite");
    }


    @AfterSuite
    public void afterSuite(){
        System.out.println("I am in after suite");
    }


}
