# Automation Framework Interview Guide

## Framework Type

Enterprise Hybrid Automation Framework

---

## Technology Stack

### Programming

- Java

### UI Automation

- Selenium WebDriver
- TestNG

### API Automation

- REST Assured

### Database Validation

- JDBC
- MySQL

### Reporting

- Extent Reports

### Logging

- Log4j2

### Build Tool

- Maven

### Source Control

- Git
- GitHub

### CI/CD

- Jenkins
- Jenkins Pipeline

---

## Design Patterns Used

### Page Object Model

Separates UI actions from test logic.

---

### Factory Pattern

Implemented using:

```text
DriverFactory
```

for browser creation.

---

### Singleton Pattern

Implemented using:

```text
ExtentManager
```

for centralized reporting.

---

### ThreadLocal Pattern

Implemented using:

```text
DriverManager
```

for thread-safe execution.

---

## Framework Utilities

### UI Utilities

```text
ConfigReader

DriverFactory

DriverManager

WaitUtil

ValidationUtil

ScreenshotUtil

ExcelUtil
```

---

### API Utilities

```text
BaseAPI

RequestSpecs

ResponseSpecs

APIUtils

APIAssertions

AuthTokenManager
```

---

### Database Utilities

```text
DBUtils

DBConstants
```

---

## Reporting

```text
Extent Reports
```

Supports:

```text
PASS
FAIL
SKIP
Logs
Screenshots
```

---

## Logging

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

## Browser Support

```text
Chrome

Edge

Firefox
```

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

## Framework Flow

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

## API Framework Flow

```text
BaseAPI
     ↓
RequestSpecs
     ↓
Authentication
     ↓
API Utilities
     ↓
API Tests
```

---

## Database Framework Flow

```text
DBUtils
     ↓
JDBC
     ↓
DatabaseValidationTest
```

---

## Jenkins Execution Flow

```text
GitHub
    ↓

Jenkins
    ↓

Pipeline
    ↓

API Tests
    ↓

Database Tests
    ↓

UI Tests
    ↓

Extent Reports
```

---

## Major Achievements

✅ Selenium Framework

✅ REST Assured Framework

✅ JDBC Framework

✅ Jenkins Integration

✅ Jenkins Pipeline

✅ Data Driven Framework

✅ Reporting Framework

✅ Logging Framework

✅ Authentication Framework

✅ Hybrid Automation Framework

---

## Future Enhancements

- Docker
- Selenium Grid
- BrowserStack
- LambdaTest
- GitHub Actions
- WireMock