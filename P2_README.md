# 🤖 Project 2: Selenium Automation — OpenCart Web Application

![Selenium](https://img.shields.io/badge/Selenium-WebDriver-green)
![Java](https://img.shields.io/badge/Language-Java-orange)
![TestNG](https://img.shields.io/badge/Framework-TestNG-red)
![Maven](https://img.shields.io/badge/Build-Maven-blue)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen)

## 📌 Project Overview
Selenium WebDriver automation project for OpenCart e-commerce application using Java, TestNG and Page Object Model (POM) design pattern.

🔗 **App Under Test:** https://demo.opencart.com

---

## 🛠️ Tech Stack
| Technology | Purpose |
|------------|---------|
| Java | Programming Language |
| Selenium WebDriver 4.x | Browser Automation |
| TestNG | Test Framework |
| Maven | Build & Dependencies |
| Page Object Model | Design Pattern |
| ChromeDriver | Browser Driver |
| WebDriverManager | Auto driver management |

---

## 📂 Project Structure
```
project2-selenium-java/
├── src/
│   ├── main/java/pages/
│   │   ├── BasePage.java
│   │   ├── HomePage.java
│   │   ├── LoginPage.java
│   │   ├── SearchPage.java
│   │   └── CartPage.java
│   └── test/java/tests/
│       ├── BaseTest.java
│       ├── LoginTest.java
│       ├── SearchTest.java
│       └── CartTest.java
├── pom.xml
├── testng.xml
└── README.md
```

---

## ✅ Automated Test Cases
| # | Module | Scenario | Status |
|---|--------|----------|--------|
| 1 | Login | Valid login | ✅ Pass |
| 2 | Login | Invalid credentials | ✅ Pass |
| 3 | Login | Empty fields validation | ✅ Pass |
| 4 | Search | Search valid product | ✅ Pass |
| 5 | Search | Search invalid keyword | ✅ Pass |
| 6 | Cart | Add product to cart | ✅ Pass |
| 7 | Cart | Remove product from cart | ✅ Pass |
| 8 | Cart | Verify cart count | ✅ Pass |
| 9 | Checkout | Navigate to checkout | ✅ Pass |
| 10 | Logout | Logout successfully | ✅ Pass |

---

## ▶️ How to Run
```bash
# Clone repo
git clone https://github.com/yourusername/project2-selenium-java.git

# Go to folder
cd project2-selenium-java

# Run all tests
mvn test

# View report
open test-output/index.html
```

---

## 👤 Author
**Your Name** | QA Automation Tester | Hyderabad
📧 youremail@gmail.com | 🔗 [LinkedIn](https://linkedin.com/in/yourprofile)
