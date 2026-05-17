package com.bstack.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bstack.utilities.WaitUtils;

public class ProductPage {

    WebDriver driver;

    public ProductPage(WebDriver driver) {

        this.driver = driver;
    }

    By firstProduct =
            By.xpath(
            "(//p[@class='shelf-item__title'])[1]");

    By addToCartButton =
            By.xpath(
            "(//div[contains(text(),'Add to cart')])[1]");

    By cartButton =
            By.className("bag__quantity");

    By cartSlider =
            By.className("float-cart");
    
    By secondAddToCartButton =
            By.xpath(
            "(//div[contains(text(),'Add to cart')])[2]");

    By removeButton =
            By.className(
            "shelf-item__del");
    

    public boolean isProductDisplayed() {

        return WaitUtils.waitForElement(
                driver,
                firstProduct).isDisplayed();
    }

    public void addProductToCart() {

        WebElement addButton =
                WaitUtils.waitForElement(
                        driver,
                        addToCartButton);

        ((JavascriptExecutor) driver)
                .executeScript(
                        "arguments[0].click();",
                        addButton);

        System.out.println(
                "Product Added To Cart");
    }

    public void openCart() {

        WaitUtils.waitForElement(
                driver,
                cartButton).click();

        System.out.println(
                "Cart Opened");
    }

    public boolean isCartDisplayed() {

        return WaitUtils.waitForElement(
                driver,
                cartSlider).isDisplayed();
    }
    
    public void addSecondProduct() {

        WaitUtils.waitForElement(
                driver,
                secondAddToCartButton)
                .click();

        System.out.println(
                "Second Product Added");
    }

    public void removeProduct() {

        WaitUtils.waitForElement(
                driver,
                removeButton)
                .click();

        System.out.println(
                "Product Removed");
    }
}