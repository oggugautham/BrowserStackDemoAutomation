package com.bstack.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bstack.base.BaseTest;
import com.bstack.pages.CartPage;
import com.bstack.pages.CheckoutPage;
import com.bstack.pages.LoginPage;
import com.bstack.pages.ProductPage;
import com.bstack.utilities.ScreenshotUtil;

public class EcommerceTest extends BaseTest {

    LoginPage lp;
    ProductPage pp;
    CartPage cp;
    CheckoutPage ch;

    // =====================================================

    @Test(priority = 1)

    public void TC_01_validateValidLogin()
            throws Exception {

        lp = new LoginPage(driver);

        lp.login();

        test.info(
                "Login Successful");

        Assert.assertTrue(
                driver.getCurrentUrl()
                .contains("bstackdemo"));

        ScreenshotUtil.captureScreenshot(
                driver,
                "TC_01_Login");

        test.addScreenCaptureFromPath(
                "screenshots/TC_01_Login.png");

        test.pass(
                "TC_01 Passed");

        System.out.println(
                "TC_01 Passed");
    }

    // =====================================================

    @Test(priority = 2)

    public void TC_02_validateProductDisplay()
            throws Exception {

        pp = new ProductPage(driver);

        boolean productVisible =
                pp.isProductDisplayed();

        Assert.assertTrue(
                productVisible);

        test.info(
                "Products Displayed");

        test.pass(
                "TC_02 Passed");

        System.out.println(
                "TC_02 Passed");
    }

    // =====================================================

    @Test(priority = 3)

    public void TC_03_validateAddToCart()
            throws Exception {

        pp = new ProductPage(driver);

        pp.addProductToCart();

        pp.openCart();

        boolean cartVisible =
                pp.isCartDisplayed();

        Assert.assertTrue(
                cartVisible);

        ScreenshotUtil.captureScreenshot(
                driver,
                "TC_03_AddToCart");

        test.addScreenCaptureFromPath(
                "screenshots/TC_03_AddToCart.png");

        test.info(
                "Product Added To Cart");

        test.pass(
                "TC_03 Passed");

        System.out.println(
                "TC_03 Passed");
    }

    // =====================================================

    @Test(priority = 4)

    public void TC_04_validateCartSlider()
            throws Exception {

        cp = new CartPage(driver);

        boolean priceVisible =
                cp.isPriceDisplayed();

        boolean quantityVisible =
                cp.isQuantityDisplayed();

        Assert.assertTrue(
                priceVisible);

        Assert.assertTrue(
                quantityVisible);

        ScreenshotUtil.captureScreenshot(
                driver,
                "TC_04_CartValidation");

        test.addScreenCaptureFromPath(
                "screenshots/TC_04_CartValidation.png");

        String quantity =
                cp.getQuantityText();

        System.out.println(
                "Cart Quantity: " + quantity);

        test.info(
                "Cart Validated");

        test.pass(
                "TC_04 Passed");

        System.out.println(
                "TC_04 Passed");
    }
    
    @Test(priority = 5)

    public void TC_05_validateMultipleItemsCart()
            throws Exception {

        pp = new ProductPage(driver);

        pp.addSecondProduct();

        cp = new CartPage(driver);

        String count =
                cp.getCartCount();

        System.out.println(
                "Cart Count: " + count);

        Assert.assertTrue(
                Integer.parseInt(count) >= 2);

        ScreenshotUtil.captureScreenshot(
                driver,
                "TC_05_MultipleCart");

        test.addScreenCaptureFromPath(
                "screenshots/TC_05_MultipleCart.png");

        test.pass(
                "Multiple Products Added");

        System.out.println(
                "TC_05 Passed");
    }
    
    @Test(priority = 6)

    public void TC_06_validateRemoveCartItem()
            throws Exception {

        pp = new ProductPage(driver);

        pp.removeProduct();

        ScreenshotUtil.captureScreenshot(
                driver,
                "TC_06_RemoveProduct");

        test.addScreenCaptureFromPath(
                "screenshots/TC_06_RemoveProduct.png");

        test.pass(
                "Product Removed Successfully");

        System.out.println(
                "TC_06 Passed");
    }

    // =====================================================

    @Test(priority = 7)

    public void TC_07_validateCheckout()
            throws Exception {

        ch = new CheckoutPage(driver);

        ch.clickCheckout();

        ch.enterCheckoutDetails();

        ch.submitOrder();

        Assert.assertTrue(
                driver.getCurrentUrl()
                .contains("checkout")
                || driver.getCurrentUrl()
                .contains("confirmation")
                || driver.getCurrentUrl()
                .contains("bstackdemo"));

        ScreenshotUtil.captureScreenshot(
                driver,
                "TC_05_Checkout");

        test.addScreenCaptureFromPath(
                "screenshots/TC_05_Checkout.png");

        test.info(
                "Checkout Completed");

        test.pass(
                "TC_05 Passed");

        System.out.println(
                "TC_05 Passed");
    }
}