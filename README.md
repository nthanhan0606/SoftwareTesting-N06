# Software Testing Practice Repository

This repository is used to upload practical assignment results for the **Software Testing** course.

## Table of Contents

- [Chapter 1 – UI/UX Evaluation](#chapter-1--uiux-evaluation-cantunsee-space)
- [Chapter 2: Testing Process – Unit Test](#chapter-2-testing-process--unit-test)
- [Chapter 3: Testing Process – End-to-End Test](#chapter-3-testing-process--end-to-end-test-cypress)

## Chapter 1 – UI/UX Evaluation (cantunsee.space)

- Complete UI challenges on [https://cantunsee.space/](https://cantunsee.space/)
- Take result screenshots with personal identification (e.g., signed-in Chrome)
- Upload screenshots to the repository

### Evidence

- Screenshot result: [ch1-cantunsee-nguyenthanhan.png](Chapter_1/ch1-cantunsee-nguyenthanhan.png)

## Chapter 2: Testing Process – Unit Test

### Problem Description

The **StudentAnalyzer** class is used to analyze student scores with two main functionalities.

**Source file:** [StudentAnalyzer.java](Chapter_2/unit-test/src/main/java/edu/cmc/StudentAnalyzer.java)

#### `countExcellentStudents`

- Counts the number of students with scores **≥ 8.0**
- Only processes **valid scores in the range [0, 10]**
- Ignores scores **out of range** (< 0 or > 10)
- Returns `0` if the list is empty or contains no valid scores

#### `calculateValidAverage`

- Calculates the average of scores **within the range [0, 10]**
- Ignores **invalid scores**
- Returns `0` if **no valid scores** are present

### Technologies Used

| Technology | Version          | Description                       |
| ---------- | ---------------- | --------------------------------- |
| Java       | 21.0.9           | Main programming language         |
| Maven      | 3.9.12           | Project and dependency management |
| JUnit      | 5.10.0 (Jupiter) | Unit testing framework            |

### How to Run

**System Requirements:** JDK 21+ and Maven 3.9+

```bash
git clone <repository-url>
cd <repository-folder>
mvn clean install
mvn test -Dtest=StudentAnalyzerTest
```

### Test Cases

| Test Case           | Input                | Expected | Description                 |
| ------------------- | -------------------- | -------- | --------------------------- |
| Valid scores        | `[9.5, 8.0, 7.5]`    | `2`      | Counts scores ≥ 8.0         |
| No excellent        | `[7.0, 6.5, 5.0]`    | `0`      | No scores meet threshold    |
| Mixed valid/invalid | `[9.0, -1, 11, 8.5]` | `2`      | Ignores out-of-range scores |
| Empty list          | `[]`                 | `0`      | Returns 0 for empty input   |

## Chapter 3: Testing Process – End-to-End Test (Cypress)

### Overview

Automated End-to-End (E2E) testing using Cypress to validate workflows on [https://www.saucedemo.com](https://www.saucedemo.com).

### System Requirements

- Node.js 14.x or higher
- npm (bundled with Node.js)
- Stable internet connection

### Project Setup

```bash
mkdir cypress-exercise
cd cypress-exercise
npm init -y
npm install cypress --save-dev
npx cypress open
```

### Test Scenarios

| Scenario         | Objective                   | Expected Result                         | Source Code                                                                       |
| ---------------- | --------------------------- | --------------------------------------- | --------------------------------------------------------------------------------- |
| Successful Login | Valid credentials login     | Redirected to `/inventory.html`         | [login_spec.cy.js](Chapter_3/cypress-exercise/cypress/e2e/login_spec.cy.js)       |
| Failed Login     | Invalid credentials         | Error message displayed                 | [login_spec.cy.js](Chapter_3/cypress-exercise/cypress/e2e/login_spec.cy.js)       |
| Add to Cart      | Add product to cart         | Cart badge shows quantity 1             | [cart_spec.cy.js](Chapter_3/cypress-exercise/cypress/e2e/cart_spec.cy.js)         |
| Sort Products    | Sort by price (low to high) | First product: $7.99                    | [cart_spec.cy.js](Chapter_3/cypress-exercise/cypress/e2e/cart_spec.cy.js)         |
| Remove from Cart | Remove product              | Cart badge removed or quantity 0        | [cart_spec.cy.js](Chapter_3/cypress-exercise/cypress/e2e/cart_spec.cy.js)         |
| Checkout         | Complete checkout workflow  | Redirected to `/checkout-step-two.html` | [checkout_spec.cy.js](Chapter_3/cypress-exercise/cypress/e2e/checkout_spec.cy.js) |

### How to Run

```bash
npx cypress open
```

Select and execute: `login_spec.cy.js`, `cart_spec.cy.js`, `checkout_spec.cy.js`

### Evidence

- Screenshots cart_spec: [cart_spec_cypress.png](Chapter_3/cypress-exercise/cypress/Evidence/cart_spec_cypress.png)
- Screenshots checkout_spec: [checkout_spec_cypress.png](Chapter_3/cypress-exercise/cypress/Evidence/checkout_spec_cypress.png)
- Screenshots login_spec: [login_spec_cypress.png](Chapter_3/cypress-exercise/cypress/Evidence/login_spec_cypress.png)

## Notes

- Tasks tracked using Git issues
- Commits follow Conventional Commit standards
