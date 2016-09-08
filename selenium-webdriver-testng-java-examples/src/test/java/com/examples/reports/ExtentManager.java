package com.examples.reports;

import com.relevantcodes.extentreports.ExtentReports;

/**
 * Created by Praveen Kothapally.
 */
public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getInstance() {
        if (extent == null) {
            extent = new ExtentReports("C:\\temp\\test.html", true);

            // optional
            extent.config()
                    .documentTitle("Automation Report")
                    .reportName("Regression")
                    .reportHeadline("");

            // optional
            extent
                    .addSystemInfo("Selenium Version", "2.46")
                    .addSystemInfo("Environment", "QA");
        }
        return extent;
    }
}
