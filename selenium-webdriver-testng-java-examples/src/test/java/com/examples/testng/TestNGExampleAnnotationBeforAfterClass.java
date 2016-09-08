package com.examples.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Praveen Kothapally.
 */
public class TestNGExampleAnnotationBeforAfterClass extends Base{


    @BeforeClass
    public void beforeClass(){
        System.out.println("I am in before class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("I am in aftre class");
    }



    @Test(priority = 2, groups = {"group1", "group2"})
    public void testCase1() {
        System.out.println("I am in test case 1");
        //test steps will go here
    }


    @Test (priority = 3, groups = {"group1"})
    public void testCase2() {
        System.out.println("I am in test case 2 ");
    }

    @Test (enabled = false, priority = 4)
    public void testCase3(){
        System.out.println("I am in test case 3");
    }



    @Test(priority = 0)
    public void testCase4(){
        System.out.println("I am in test case 4");
    }


    @Test (priority = 1)
    public void testCase5(){
        System.out.println("I am in test case 5");
    }

    @Test (priority = 5)
    public void testCase6(){
        System.out.println("I am in test case 6");
    }



}
