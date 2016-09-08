package com.examples.reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Praveen Kothapally.
 */
public class ExtentReportExample {

    private ExtentReports extent;

    @BeforeClass
    public void beforeClass() {
        extent = new ExtentReports("C:\\temp\\test.html", true);
    }

    @Test
    public void test() {
        ExtentTest test = extent.startTest("My First Test", "Sample description");
        test.log(LogStatus.PASS, "StepName", "PASS Details");
        extent.endTest(test);
    }

    @AfterSuite
    public void afterSuite() {
        // write all resources to report file
        extent.flush();

        // terminates extent and clears the underlying stream

    }
}
