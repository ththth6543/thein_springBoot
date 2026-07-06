# Spring Boot Calculator Study Project

이 프로젝트는 Spring Boot 학습 및 REST API 실습을 위한 간단한 사칙연산 계산기 웹 애플리케이션입니다.

---

## 🛠 Tech Stack

- **Language:** Java 21 (OpenJDK 21)
- **Framework:** Spring Boot 3.5.x
- **Build Tool:** Gradle

---

## 📂 Project Structure

```text
com.example.demo (Main Application Package)
└── DemoApplication.java (메인 애플리케이션 클래스)

com.jun.calculator (Calculator Business Logic)
├── CalcController.java (REST API 컨트롤러)
└── CalcService.java (사칙연산 비즈니스 로직 서비스)
```

---

## 🚀 Features & API Endpoints

제공되는 사칙연산 API는 HTTP GET 메서드로 요청하며, 쿼리 스트링 파라미터 `a`와 `b`를 받아서 결과를 반환합니다.

### 1. 덧셈 (Addition)
* **Endpoint:** `GET /add`
* **Example:** `http://localhost:8080/add?a=10&b=5`
* **Output:** `15`

### 2. 뺄셈 (Subtraction)
* **Endpoint:** `GET /sub`
* **Example:** `http://localhost:8080/sub?a=10&b=5`
* **Output:** `5`

### 3. 곱셈 (Multiplication)
* **Endpoint:** `GET /mul`
* **Example:** `http://localhost:8080/mul?a=10&b=5`
* **Output:** `50`

### 4. 나눗셈 (Division)
* **Endpoint:** `GET /div`
* **Example:** `http://localhost:8080/div?a=10&b=5`
* **Output:** `2`
* **Note:** 나누는 수(`b`)가 `0`인 경우 `400 Bad Request`와 함께 예외 메시지가 반환됩니다.

---

## 🏃 How to Run

로컬 환경에서 프로젝트를 실행하려면 터미널에서 다음 명령어를 실행합니다.

```bash
# Repository 클론
git clone <repository-url>
cd demo

# 애플리케이션 빌드 및 실행
./gradlew bootRun
```
