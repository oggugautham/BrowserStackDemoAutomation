package com.bstack.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {

            driver = new ChromeDriver();

            driver.manage().window().maximize();
        }

        return driver;
    }
}