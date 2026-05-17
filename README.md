# BrowserStack Demo Automation Framework

## Project Overview

This project automates the BrowserStack Demo Ecommerce application using Selenium WebDriver, Java, TestNG, Maven, and Page Object Model (POM) framework design.

Application URL:
https://bstackdemo.com/

---

## Tools & Technologies Used

- Java
- Selenium WebDriver
- TestNG
- Maven
- Extent Reports
- Page Object Model (POM)
- Apache Commons IO

---

## Framework Features

- Reusable Page Object Model structure
- TestNG Test Execution
- Screenshot Capture Utility
- Extent Report Integration
- Configurable framework using config.properties
- Wait Utility Methods
- Sequential Ecommerce Flow Automation

---

## Modules Covered

### Login Validation
- Valid Login Test

### Product Listing Validation
- Product visibility verification

### Add To Cart Validation
- Add product to cart
- Cart open validation

### Cart Validation
- Quantity validation
- Price visibility validation

### Checkout Validation
- Checkout flow automation
- Shipping details submission

---

## Framework Structure

src/test/java

- com.bstack.base
- com.bstack.pages
- com.bstack.tests
- com.bstack.utilities

src/test/resources

- config/config.properties

---

## Test Cases Implemented

| Test Case ID | Description |
|---|---|
| TC_01 | Validate Valid Login |
| TC_02 | Validate Product Display |
| TC_03 | Validate Add To Cart |
| TC_04 | Validate Cart Validation |
| TC_05 | Validate Checkout Flow |

---

## How To Run

1. Clone the repository
2. Open project in Eclipse
3. Update Maven Dependencies
4. Run testng.xml

---

## Reports & Screenshots

- ExtentReport.html generated after execution
- Screenshots captured during test execution

---

## Author

Max