package com.bstack.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.bstack.utilities.ConfigReader;
import com.bstack.utilities.WaitUtils;

public class LoginPage {

    WebDriver driver;

    Properties prop;

    public LoginPage(WebDriver driver) {

        this.driver = driver;

        prop = ConfigReader.getProperties();
    }

    By signInButton =
            By.id("signin");

    By usernameDropdown =
            By.id("username");

    By passwordDropdown =
            By.id("password");

    By loginButton =
            By.id("login-btn");
    
    By loginErrorMessage =
            By.xpath(
            "//h3[contains(text(),'Invalid')]");

    public void login() {

        WaitUtils.waitForElement(
                driver,
                signInButton).click();

        WaitUtils.waitForElement(
                driver,
                usernameDropdown).click();

        driver.findElement(
                By.xpath(
                        "//div[text()='"
                        + prop.getProperty("username")
                        + "']"))
                .click();

        WaitUtils.waitForElement(
                driver,
                passwordDropdown).click();

        driver.findElement(
                By.xpath(
                        "//div[text()='"
                        + prop.getProperty("password")
                        + "']"))
                .click();

        WaitUtils.waitForElement(
                driver,
                loginButton).click();

        System.out.println(
                "Login Successful");
    }
    
}