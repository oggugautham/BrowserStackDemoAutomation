package com.bstack.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.bstack.utilities.WaitUtils;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {

        this.driver = driver;
    }

    By productPrice =
            By.className("sub-price");

    By cartQuantity =
            By.className("bag__quantity");

    public boolean isPriceDisplayed() {

        return WaitUtils.waitForElement(
                driver,
                productPrice).isDisplayed();
    }

    public boolean isQuantityDisplayed() {

        return WaitUtils.waitForElement(
                driver,
                cartQuantity).isDisplayed();
    }

    public String getQuantityText() {

        return WaitUtils.waitForElement(
                driver,
                cartQuantity).getText();
    }
}