package com.bstack.base;

import java.lang.reflect.Method;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.bstack.utilities.ConfigReader;
import com.bstack.utilities.DriverFactory;
import com.bstack.utilities.ExtentManager;

public class BaseTest {

    public WebDriver driver;

    public Properties prop;

    public static ExtentReports report;

    public ExtentTest test;

    @BeforeClass

    public void setup() {

        prop =
                ConfigReader.getProperties();

        driver =
                DriverFactory.getDriver();

        driver.get(
                prop.getProperty("url"));

        report =
                ExtentManager.getReport();

        System.out.println(
                "Browser Launched Successfully");
    }

    @BeforeMethod

    public void createTest(Method method) {

        test =
                report.createTest(
                        method.getName());
    }

    @AfterClass

    public void teardown() {

        if (driver != null) {

            driver.quit();
        }

        report.flush();

        System.out.println(
                "Browser Closed Successfully");
    }
}