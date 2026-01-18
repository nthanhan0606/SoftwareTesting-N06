# Software Testing Practice Repository

This repository is used to upload practical assignment results for the **Software Testing** course.

## Table of Contents
- [Chapter 1 – UI/UX Evaluation](#chapter-1--uiux-evaluation-cantunsee-space)
- [Chapter 2: Testing Process – Unit Test](#chapter-2-testing-process--unit-test)

## Chapter 1 – UI/UX Evaluation (cantunsee.space)

- Complete UI challenges on [https://cantunsee.space/](https://cantunsee.space/)
- Take result screenshots with personal identification (e.g., signed-in Chrome)
- Upload screenshots to the repository

### Evidence

- Screenshot result: [ch1-cantunsee-nguyenthanhan.png](Chapter_1/ch1-cantunsee-nguyenthanhan.png)

## Notes

- Tasks are tracked using Git issues
- Commits follow Conventional Commit standards

## Chapter 2: Testing Process – Unit Test

### Problem Description

The **StudentAnalyzer** class is used to analyze student scores with two main functionalities.

**Source file:** [StudentAnalyzer.java](src/main/java/StudentAnalyzer.java)

### `countExcellentStudents`

**Count excellent students**

- Counts the number of students with scores **≥ 8.0**
- Only processes **valid scores in the range [0, 10]**
- Ignores scores that are **out of range** (e.g., &lt; 0 or &gt; 10)
- Returns `0` if the list is empty or contains no valid scores

### `calculateValidAverage`

**Calculate valid average score**

- Calculates the average of scores **within the range [0, 10]**
- Ignores **invalid scores**
- Returns `0` if **no valid scores** are present

---

## Technologies Used

| Technology | Version          | Description                       |
| ---------- | ---------------- | --------------------------------- |
| Java       | 21.0.9           | Main programming language         |
| Maven      | 3.9.12           | Project and dependency management |
| JUnit      | 5.10.0 (Jupiter) | Unit testing framework            |

## How to Run the Project

### System Requirements

- Java Development Kit (JDK) **21 or higher**
- Maven **3.9 or higher**

---

### Clone the Repository

```bash
git clone <repository-url>
cd <repository-folder>
```

### Build the project

```bash
mvn clean install
```

### Run Specific Test Class

```bash
mvn test -Dtest=StudentAnalyzerTest
```

**Test file:** [StudentAnalyzerTest.java](src/test/java/StudentAnalyzerTest.java)

## Test Cases

### `countExcellentStudents` Tests

| Test Case           | Input                | Expected Result | Description                 |
| ------------------- | -------------------- | --------------- | --------------------------- |
| Valid scores        | `[9.5, 8.0, 7.5]`    | `2`             | Counts scores ≥ 8.0         |
| No excellent        | `[7.0, 6.5, 5.0]`    | `0`             | No scores meet threshold    |
| Mixed valid/invalid | `[9.0, -1, 11, 8.5]` | `2`             | Ignores out-of-range scores |
| Empty list          | `[]`                 | `0`             | Returns 0 for empty input   |

### `calculateValidAverage` Tests

| Test Case           | Input                 | Expected Result | Description                        |
| ------------------- | --------------------- | --------------- | ---------------------------------- |
| Valid scores        | `[8.0, 9.0, 10.0]`    | `9.0`           | Calculates average of valid scores |
| Mixed valid/invalid | `[8.0, -1, 10.0, 11]` | `9.0`           | Ignores invalid scores             |
| Empty list          | `[]`                  | `0`             | Returns 0 for empty input          |
| All invalid         | `[-5, 15, 20]`        | `0`             | Returns 0 when no valid scores     |

