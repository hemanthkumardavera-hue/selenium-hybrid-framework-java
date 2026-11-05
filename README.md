# 🚀 Enterprise Hybrid Automation Framework

![Java](https://img.shields.io/badge/Java-25-orange)
![Selenium](https://img.shields.io/badge/Selenium-4.x-green)
![REST%20Assured](https://img.shields.io/badge/REST%20Assured-API%20Testing-blue)
![TestNG](https://img.shields.io/badge/TestNG-Framework-red)
![MySQL](https://img.shields.io/badge/MySQL-Database-blue)
![Jenkins](https://img.shields.io/badge/Jenkins-CI%2FCD-red)
![Maven](https://img.shields.io/badge/Maven-Build%20Tool-orange)
![License](https://img.shields.io/badge/License-MIT-success)

---

# 📌 Project Overview

This project is a scalable, maintainable, and reusable Enterprise Hybrid Automation Framework developed using industry-standard design patterns and automation best practices.

The framework supports automation across:

```text
UI Layer
↓
API Layer
↓
Database Layer
↓
CI/CD Pipeline
```

and demonstrates real-world Automation Engineer and SDET capabilities.

---

# 🎯 Framework Highlights

✅ UI Automation Framework

✅ API Automation Framework

✅ Database Validation Framework

✅ Hybrid Execution

✅ Jenkins CI/CD

✅ Jenkins Pipeline as Code

✅ Extent Reports

✅ Log4j2 Logging

✅ Data Driven Testing

✅ Cross Browser Execution

✅ Authentication Framework

✅ Reusable Utilities

✅ Thread-Safe Driver Management

---

# 🛠 Technology Stack

## Programming Language

- Java

## UI Automation

- Selenium WebDriver 4
- TestNG

## API Automation

- REST Assured
- Jackson Object Mapping

## Database Automation

- JDBC
- MySQL

## Reporting

- Extent Reports

## Logging

- Log4j2

## Data Driven Testing

- Apache POI
- Excel

## Build & Dependency Management

- Maven

## Version Control

- Git
- GitHub

## CI/CD

- Jenkins
- Jenkins Pipeline (Jenkinsfile)

---

# 🏗 Framework Architecture

```text
                         Jenkins Pipeline
                                 │
                                 ▼

┌────────────────────────────────────────────┐
│      Enterprise Hybrid Automation          │
└────────────────────────────────────────────┘

        │
        ├──── UI Layer
        │         │
        │         ▼
        │   Selenium WebDriver
        │
        ├──── API Layer
        │         │
        │         ▼
        │    REST Assured
        │
        ├──── Database Layer
        │         │
        │         ▼
        │         JDBC
        │
        └──── Reporting
                  │
                  ▼
           Extent Reports
```

---

# 📂 Project Structure

```text
automation-framework
│
├── src
│   ├── main
│   │
│   └── test
│       └── java
│
│           ├── com.qa.base
│           │      ├── BaseTest
│           │
│           ├── com.qa.pages
│           │      ├── LoginPage
│           │      └── HomePage
│           │
│           ├── com.qa.tests
│           │      ├── LoginTest
│           │      └── LogoutTest
│           │
│           ├── com.qa.api
│           │      ├── auth
│           │      ├── base
│           │      ├── models
│           │      ├── specs
│           │      ├── tests
│           │      └── utils
│           │
│           ├── com.qa.db
│           │      ├── DBUtils
│           │      ├── DBConstants
│           │      └── DatabaseValidationTest
│           │
│           └── com.qa.utilities
│                  ├── ConfigReader
│                  ├── DriverFactory
│                  ├── DriverManager
│                  ├── WaitUtil
│                  ├── ValidationUtil
│                  ├── ScreenshotUtil
│                  ├── ExcelUtil
│                  ├── ExtentManager
│                  └── TestListener
│
├── reports
│
├── suites
│      ├── smoke.xml
│      ├── api.xml
│      ├── db.xml
│      └── hybrid.xml
│
├── testdata
│      └── LoginData.xlsx
│
├── pom.xml
│
└── Jenkinsfile
```

---

# 🔥 Design Patterns Used

## Page Object Model (POM)

Used to separate page locators and business actions from test logic.

Example:

```text
LoginPage
HomePage
```

---

##  Singleton Pattern

Implemented through:

```text
ExtentManager
```

for report management.

---

## ThreadLocal Pattern

Implemented through:

```text
DriverManager
```

for thread-safe browser execution.

---

## Data Driven Testing

Implemented using:

```text
Apache POI
+
Excel
+
TestNG DataProvider
```

---

# ✅ Framework Features

## UI Automation

- Login Validation
- Logout Validation
- Positive Test Scenarios
- Negative Test Scenarios
- Cross Browser Execution
- Data Driven Testing
- Screenshot Capture
- Explicit Wait Handling

---

## API Automation

- GET Requests
- POST Requests
- Authentication APIs
- Serialization
- Deserialization
- Nested Object Mapping
- Collection Mapping
- Request Specifications
- Response Specifications
- API Logging
- API Reporting

---

## Database Validation

- JDBC Integration
- MySQL Connectivity
- Database Assertions
- Prepared Statements
- Reusable DB Utilities

---

# 📊 Reporting

Integrated:

```text
Extent Reports
```

Features:

- PASS Reporting
- FAIL Reporting
- SKIP Reporting
- Execution Logs
- Screenshots on Failure

Output Location:

```text
reports/ExtentReport.html
```

---

# 📝 Logging

Integrated:

```text
Log4j2
```

Supports:

```text
UI Logs

API Logs

Database Logs

Framework Logs
```

---

# 🚀 Test Execution

## Run UI Suite

```bash
mvn test -DsuiteXmlFile=suites/smoke.xml
```

---

## Run API Suite

```bash
mvn test -DsuiteXmlFile=suites/api.xml
```

---

## Run Database Suite

```bash
mvn test -DsuiteXmlFile=suites/db.xml
```

---

## Run Hybrid Suite

```bash
mvn test -DsuiteXmlFile=suites/hybrid.xml
```

---

# ⚙ Jenkins Integration

Implemented Jobs:

### UI Framework Build

```text
UI_Framework_Build
```

### API Framework Build

```text
API_Framework_Build
```

### Database Framework Build

```text
DB_Framework_Build
```

### Hybrid Framework Build

```text
Hybrid_Framework_Build
```

### Jenkins Pipeline

```text
Automation_Pipeline
```

---

# 🏗 Jenkins Pipeline Flow

```text
Checkout
    ↓

Build
    ↓

API Tests
    ↓

Database Tests
    ↓

UI Tests
    ↓

Extent Report
```

Pipeline managed through:

```text
Jenkinsfile
```

---

# 📚 Key Learning Outcomes

## Selenium

- Page Object Model
- Explicit Waits
- Driver Management
- Data Driven Testing

## API Automation

- Serialization
- Deserialization
- Authentication
- POJO Mapping
- Framework Design

## Database Validation

- JDBC
- SQL Queries
- Prepared Statements
- Database Assertions

## DevOps

- Git
- GitHub
- Jenkins
- CI/CD Pipelines
- Jenkinsfile

---

# 🔮 Future Enhancements

- Docker Integration
- Selenium Grid
- BrowserStack Integration
- LambdaTest Integration
- WireMock API Testing
- GitHub Actions
- Allure Reporting

---

# 📊 Framework Statistics

✅ 3 Automation Frameworks
   - UI
   - API
   - Database

✅ 4 Test Suites
   - Smoke
   - Sanity
   - Regression
   - Hybrid

✅ 3 Jenkins Jobs
   - UI
   - API
   - Database

✅ 1 Jenkins Pipeline

✅ 15+ Utility Classes

✅ Cross Browser Architecture

✅ Thread Safe Execution

# 👨‍💻 Author

### Davera Hemanth Kumar

**Role:** QA Engineer

**Framework Type:** Enterprise Hybrid Automation Framework

---

# ⭐ Framework Evolution

```text
Standalone Selenium Script
            ↓

Basic Framework
            ↓

POM Framework
            ↓

Data Driven Framework
            ↓

Hybrid Framework
            ↓

UI + API Framework
            ↓

UI + API + Database Framework
            ↓

CI/CD Enabled Framework
            ↓

Enterprise Hybrid Automation Framework
```

---

# 📈 Final Outcome

Successfully designed and implemented a scalable Enterprise Hybrid Automation Framework supporting:

✅ UI Automation

✅ API Automation

✅ Database Validation

✅ Data Driven Testing

✅ Reporting

✅ Logging

✅ Authentication

✅ Jenkins CI/CD

✅ Jenkins Pipeline

✅ Cross Browser Execution

✅ Reusable Utilities

✅ Enterprise Framework Architecture

# 💡 Business Value

This framework demonstrates real-world automation engineering practices including:

- UI Automation
- API Automation
- Database Validation
- CI/CD Implementation
- Reporting and Logging
- Cross Browser Architecture
- Scalable Framework Design

The framework is capable of validating end-to-end business workflows across UI, API and Database layers.


# 📸 Framework Screenshots

## Jenkins Pipeline

automation-framework\ProjectLevel\screenshots\Automation_Pipeline.png

## Extent Report

automation-frameworkProjectLevelscreenshots\extent-report.png

## Jenkins Dashboard

automation-framework\ProjectLevel\screenshots\jenkins-dashboard.png

