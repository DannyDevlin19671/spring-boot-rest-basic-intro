# Basic REST Demo

This is a simple Spring Boot project demonstrating a REST API with basic GET and POST endpoints. It's designed to log messages when APIs are called and is ideal as a lightweight introduction to Spring Web MVC.

---

## ✨ Features

- Spring Boot 3.4.4
- REST API with `@RestController`
- `GET /demo` and `POST /demo` endpoints
- Java 21 support
- Maven build

---

## 📁 Project Structure

```
basic-rest-demo
 ├── pom.xml
 └── src
     └── main
         └── java
             └── com
                 └── binevenagh
                     └── spring
                         └── boot
                             └── basic_rest_demo
                                 ├── BasicRestDemoApplication.java
                                 └── DemoController.java
```

---

## 🧪 How to Run

Make sure you have **Java 21** and **Maven** installed.

1. **Build the project:**

```
mvn clean install
```

2. **Run the app:**

```
mvn spring-boot:run
```

---

## 🔗 API Endpoints

| Method | Endpoint   | Description                      |
|--------|------------|----------------------------------|
| GET    | `/demo`    | Returns a greeting message       |
| POST   | `/demo`    | Returns a POST greeting response |

---

## 📦 Dependencies

- `spring-boot-starter-web`
- `spring-boot-starter-test` (test scope)

---

## 🧾 License

This project is for demonstration and educational use.
