# Selenium Hybrid Automation Framework - Complete Development Journey

## Project Objective

The objective of this project was to design and develop a scalable, maintainable, and reusable Selenium Automation Framework from scratch using industry-standard design patterns and best practices.

### Goals

- Automate Web Application Testing
- Implement Page Object Model (POM)
- Support Data Driven Testing
- Generate Detailed Reports
- Support Multiple Browsers
- Create Reusable Components
- Build a Framework that is Easy to Maintain and Scale

---

# Technologies Used

- Java
- Selenium WebDriver
- TestNG
- Maven
- Apache POI
- Extent Reports
- Page Object Model (POM)

---

# Phase 1 - Maven Project Setup

## What We Did

Created a Maven Project.

Added dependencies through `pom.xml`.

### Dependencies Added

- Selenium Java
- TestNG
- Apache POI
- Extent Reports

## Why

Without Maven:

- Manual JAR management is difficult.
- Version conflicts occur frequently.
- Project becomes difficult to maintain.

## What We Learned

- Dependency Management
- Build Management
- Standard Project Structure

---

# Phase 2 - Framework Package Structure

## Created Package Structure

```text
com.qa.base

com.qa.pages

com.qa.tests

com.qa.utilities
```

## Why

To separate framework responsibilities.

### Base Package

Contains:

```text
BaseTest
```

### Pages Package

Contains:

```text
LoginPage
HomePage
```

### Tests Package

Contains:

```text
LoginTest
LogoutTest
```

### Utilities Package

Contains:

```text
ConfigReader
WaitUtil
ExcelUtil
ScreenshotUtil
ValidationUtil
DriverFactory
DriverManager
TestListener
```

## What We Learned

- Clean Architecture
- Separation of Concerns
- Better Maintainability

---

# Phase 3 - ConfigReader

## What We Built

Created:

```java
ConfigReader
```

## Purpose

Read application configuration from:

```properties
config.properties
```

Example:

```properties
browser=chrome

url=https://the-internet.herokuapp.com/login
```

## Why

Avoid hardcoded values.

Bad:

```java
driver.get("https://example.com");
```

Good:

```java
config.getProperty("url");
```

## What We Learned

- External Configuration
- Better Maintainability

---

# Phase 4 - BaseTest

## What We Built

Created:

```java
BaseTest
```

## Responsibilities

- Browser Launch
- Application Launch
- Browser Cleanup

## Why

Without BaseTest:

Every test would contain:

```java
WebDriver driver =
new ChromeDriver();
```

repeated again and again.

## Benefits

- Reusable Setup
- Reusable Teardown
- Less Duplicate Code

---

# Phase 5 - First Login Automation

## What We Built

Created:

```java
LoginPage
```

## Implemented

```java
login()
```

## Purpose

Perform login operation.

## What We Learned

- Page Object Model
- Locator Management
- Action Reusability

---

# Phase 6 - WaitUtil

## Problem Faced

Application elements were loading slowly.

Common Exceptions:

```text
NoSuchElementException

ElementNotInteractableException
```

## Solution

Created:

```java
WaitUtil
```

Methods:

```java
waitForVisibility()

waitForClickable()
```

## Why

Do not use:

```java
Thread.sleep()
```

inside framework.

## What We Learned

- Explicit Waits
- Synchronization
- Stable Automation

---

# Phase 7 - Screenshot Utility

## What We Built

Created:

```java
ScreenshotUtil
```

## Purpose

Capture screenshots during test failures.

## Benefit

Helpful during:

```text
Debugging
Failure Analysis
Reporting
```

## What We Learned

- Failure Investigation
- Automated Evidence Collection

---

# Phase 8 - Extent Reports

## What We Built

Created:

```java
ExtentManager
```

Integrated:

```java
Extent Reports
```

## Purpose

Generate execution reports.

Report Includes:

```text
PASS

FAIL

SKIP

Screenshots
```

## Benefits

- Professional Reporting
- Better Visibility

---

# Phase 9 - Test Listener

## What We Built

Created:

```java
TestListener
```

Methods:

```java
onTestStart()

onTestSuccess()

onTestFailure()

onTestSkipped()
```

## Purpose

Centralize reporting activities.

## Benefit

No need to write reporting code inside tests.

## What We Learned

- Event Driven Reporting
- TestNG Listener Architecture

---

# Phase 10 - Data Driven Framework

## Objective

Run the same test with multiple datasets.

## What We Built

Created:

```java
ExcelUtil
```

Using:

```text
Apache POI
```

## Test Data Location

```text
testdata/LoginData.xlsx
```

## Excel Format

```text
Username | Password | Expected

tomsmith | SuperSecretPassword! | PASS

admin | admin123 | FAIL

test | test123 | FAIL
```

## Benefits

- Test Data outside Code
- Better Maintainability

---

# Phase 11 - DataProvider Integration

## What We Built

Created:

```java
TestData
```

Implemented:

```java
@DataProvider
```

## Purpose

Pass multiple datasets to same test.

## Benefit

Single Test

↓

Multiple Executions

## Example

```text
tomsmith

admin

test
```

---

# Phase 12 - Problems Faced During Excel Integration

## Issue 1

### Error

```text
NullPointerException
```

### Cause

Excel Cell Empty

### Solution

```java
if(cell == null)
continue;
```

### Lesson Learned

Always validate Excel data.

---

## Issue 2

### Error

```text
Header Row Treated as Test Data
```

### Cause

Loop started from wrong index.

### Solution

Skip header row.

---

## Issue 3

### Error

```text
null | null
```

executed as test data.

### Cause

Excel had empty rows.

### Solution

Ignore empty rows.

---

# Phase 13 - Expected Result Logic

## Problem

Every login was expected to pass.

Example:

```java
Assert.assertTrue(
currentUrl.contains("secure")
);
```

This failed for invalid users.

## Solution

Added:

```text
Expected
```

column inside Excel.

Example:

```text
PASS

FAIL
```

## Benefit

Same test handles:

- Positive Testing
- Negative Testing

---

# Phase 14 - Validation Utility

## What We Built

Created:

```java
ValidationUtil
```

Methods:

```java
verifyTrue()

verifyEquals()
```

## Why

Avoid direct:

```java
Assert.assertTrue()
```

inside test classes.

## Benefit

Better maintainability.

---

# Phase 15 - Constants Class

## Problem

Hardcoded Strings everywhere.

Example:

```java
"PASS"

"FAIL"

"login"

"secure"
```

## Solution

Created:

```java
Constants
```

## Benefit

Centralized Framework Constants

---

# Phase 16 - BasePage

## What We Built

Created:

```java
BasePage
```

Reusable Methods:

```java
click()

enterText()

isElementDisplayed()
```

## Why

Avoid duplicate code in every page.

## Benefit

Cleaner Page Objects

---

# Phase 17 - HomePage

## What We Built

Created:

```java
HomePage
```

Methods:

```java
isLogoutDisplayed()

logout()
```

## Purpose

Represent post-login area.

## What We Learned

Application flow should be modeled using pages.

---

# Phase 18 - Logout Flow

## Implemented Navigation

```text
LoginPage
        ↓
HomePage
        ↓
Logout
        ↓
LoginPage
```

## Why

Validate complete user session lifecycle.

## Benefit

Real User Workflow Testing

---

# Phase 19 - DriverFactory

## Problem

Browser was hardcoded.

Example:

```java
new ChromeDriver();
```

## Solution

Created:

```java
DriverFactory
```

Supports:

```text
Chrome

Edge

Firefox
```

## Benefit

Cross Browser Support

---

# Phase 20 - DriverManager

## Objective

Prepare framework for scalability.

## Implemented

```java
ThreadLocal<WebDriver>
```

inside:

```java
DriverManager
```

## Why

Enable Parallel Execution.

## Benefit

Thread Safe Driver Management

---

# Phase 21 - Major Bugs Encountered

## Bug #1

### Error

```text
driver = null
```

### Cause

Duplicate driver variable inside LoginPage.

Example:

```java
WebDriver driver;
```

shadowed BasePage driver.

### Solution

Removed duplicate driver declaration.

### Lesson

Never redeclare inherited variables.

---

## Bug #2

### Error

```text
Header Row Executed as Test
```

### Cause

Incorrect Excel Loop.

### Solution

Skip first row.

---

## Bug #3

### Error

```text
null values treated as valid dataset
```

### Cause

Empty Excel rows.

### Solution

Ignore empty rows.

---

## Bug #4

### Error

```text
All Login Tests Failed
```

### Cause

Login action not executed before validation.

### Solution

Call:

```java
loginPage.login();
```

before assertions.

---

# Phase 22 - Final Framework Architecture

```text
BaseTest
       ↓
DriverManager
       ↓
DriverFactory
       ↓
Page Objects
       ↓
Utilities
       ↓
Tests
```

---

# Design Patterns Used

## Page Object Model

Pages:

```text
LoginPage

HomePage
```

---

## Factory Pattern

Implemented in:

```text
DriverFactory
```

---

## Singleton Pattern

Implemented in:

```text
ExtentManager
```

---

## Data Driven Testing

Implemented using:

```text
Excel

Apache POI

TestNG DataProvider
```

---

# Lessons Learned

## Technical Lessons

- Selenium WebDriver
- TestNG
- Apache POI
- Page Object Model
- Reporting
- Wait Strategies
- Driver Management

## Framework Design Lessons

- Keep Tests Thin
- Keep Logic Inside Pages
- Avoid Hardcoding
- Build Reusable Components
- Centralize Configurations
- Separate Test Data from Code

---

# Success Patterns Identified

✅ Reusable Utilities

✅ Data Driven Testing

✅ Separation of Concerns

✅ Centralized Reporting

✅ Page Object Model

✅ Configuration Driven Execution

✅ Cross Browser Readiness

---

# Future Enhancements

- Parallel Execution
- Jenkins Integration
- GitHub Actions
- REST Assured API Automation
- Docker Integration
- Selenium Grid

---

# Final Outcome

Successfully developed a Hybrid Selenium Automation Framework supporting:

- Data Driven Testing
- Reporting
- Screenshot Capture
- Page Object Model
- Cross Browser Execution
- Reusable Utilities
- DriverFactory
- DriverManager
- Extent Reports
- TestNG DataProviders

This framework is maintainable, scalable, and designed following industry best practices.