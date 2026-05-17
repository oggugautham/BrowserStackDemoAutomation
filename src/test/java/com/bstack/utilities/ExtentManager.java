package com.bstack.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {

    static ExtentReports report;

    public static ExtentReports getReport() {

        if (report == null) {

            ExtentSparkReporter spark =
                    new ExtentSparkReporter(
                            "ExtentReport.html");

            spark.config()
                    .setDocumentTitle(
                            "Automation Report");

            spark.config()
                    .setReportName(
                            "BrowserStack Selenium Report");

            spark.config()
                    .setTheme(
                            Theme.DARK);

            report = new ExtentReports();

            report.attachReporter(spark);

            report.setSystemInfo(
                    "Project",
                    "BrowserStack Demo");

            report.setSystemInfo(
                    "Tester",
                    "Max");
        }

        return report;
    }
}