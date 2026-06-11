package utilities;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManger {

    private static ExtentReports extent;

    public static ExtentReports getReport() {

        if(extent == null) {

            ExtentSparkReporter spark =
                    new ExtentSparkReporter(
                            "reports/ExtentReport.html");

            extent = new ExtentReports();

            extent.attachReporter(spark);

            extent.setSystemInfo(
                    "Framework",
                    "Selenium Cucumber");

        }

        return extent;
    }
}