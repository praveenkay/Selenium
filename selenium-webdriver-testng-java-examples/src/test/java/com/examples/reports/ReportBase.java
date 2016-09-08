package com.examples.reports;

import com.relevantcodes.extentreports.ExtentReports;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * Created by Praveen Kothapally.
 */
public class ReportBase {

    public static ExtentReports extent;


    @BeforeSuite
    public void beforeSuite(){
        if (extent == null) {
            extent = new ExtentReports("C:\\temp\\test.html", true);

            // optional
            extent.config()
                    .documentTitle("OrangeHRM Test Automation Report")
                    .reportName("Regression")
                    .reportHeadline("");

            // optional
            extent
                    .addSystemInfo("Selenium Version", "2.46.0")
                    .addSystemInfo("Environment", "QA");
        }
    }



    @AfterSuite
    public void afterSuite(){
        // write all resources to report file
        extent.flush();

        // terminates extent and clears the underlying stream
        // extent.close();
    }
}
