package com.bstack.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.bstack.utilities.WaitUtils;

public class CheckoutPage {

    WebDriver driver;

    public CheckoutPage(WebDriver driver) {

        this.driver = driver;
    }

    By checkoutButton =
            By.xpath(
            "//div[contains(text(),'Checkout')]");

    By firstName =
            By.id("firstNameInput");

    By lastName =
            By.id("lastNameInput");

    By address =
            By.id("addressLine1Input");

    By province =
            By.id("provinceInput");

    By postalCode =
            By.id("postCodeInput");

    By submitButton =
            By.id("checkout-shipping-continue");

    public void clickCheckout() {

        WaitUtils.waitForElement(
                driver,
                checkoutButton).click();

        System.out.println(
                "Checkout Button Clicked");
    }

    public void enterCheckoutDetails() {

        WaitUtils.waitForElement(
                driver,
                firstName)
                .sendKeys("Max");

        driver.findElement(lastName)
                .sendKeys("User");

        driver.findElement(address)
                .sendKeys("Hyderabad");

        driver.findElement(province)
                .sendKeys("Telangana");

        driver.findElement(postalCode)
                .sendKeys("500001");

        System.out.println(
                "Checkout Details Entered");
    }

    public void submitOrder() {

        WaitUtils.waitForElement(
                driver,
                submitButton).click();

        System.out.println(
                "Order Submitted");
    }
}