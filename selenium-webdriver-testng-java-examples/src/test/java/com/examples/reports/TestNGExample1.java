package com.examples.reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.*;

/**
 * Created by Praveen Kothapally.
 */
public class TestNGExample1 extends ReportBase{




    private ExtentTest test;

    @BeforeTest
    public void beforeTest(){

    }


    @AfterMethod
    public void afterMethod() {
        extent.endTest(test);
    }



    @Test(priority = 2)
    public void testCase1() {

        System.out.println("I am in test case 1");
        //test steps will go here
        test = extent.startTest("Test 1", "Sample description");
        test.log(LogStatus.PASS, "StepName", "PASS Details");
    }


    @Test (priority = 3)
    public void testCase2() {
        System.out.println("I am in test case 2 ");

        test = extent.startTest("Test 2", "Sample description");
        test.log(LogStatus.FAIL, "StepName", "PASS Details");
    }

    @Test (enabled = false, priority = 4)
    public void testCase3(){
        System.out.println("I am in test case 3");
        test = extent.startTest("Test 3", "Sample description 3");
        test.log(LogStatus.SKIP, "StepName", "PASS Details");
    }



    @Test(priority = 0)
    public void testCase4(){
        System.out.println("I am in test case 4");
        test = extent.startTest("Test 4", "Sample description");
        test.log(LogStatus.PASS, "StepName", "PASS Details");
    }


    @Test (priority = 1)
    public void testCase5(){
        System.out.println("I am in test case 5");
        test = extent.startTest("Test 5", "Sample description 5");
        test.log(LogStatus.ERROR, "StepName", "PASS Details");
    }

    @Test (priority = 5)
    public void testCase6(){
        System.out.println("I am in test case 6");
    }



}
