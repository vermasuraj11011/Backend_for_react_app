# Simple Backend SpringBoot Project
It is a BE service to serve React app below <br>
[React App](https://github.com/vermasuraj11011/React_Basic)

## What is the use of this Repo

This Project is a Simple Backend Service.
1. Creating a CRUD api for courses.
2. Serves HTTP calls from **React** app running on different port.
3. Used **MySql** DB, Spring JPA and JDBC to perform DB operation.
4. Get to know about CORS configuration.
5. Spring MVC architecture.

The Application Runs on **localhost:3000**

## Application design

#### MVC
Followed MVC architecture 
1. MyController which has the required request mapping.
2. CourseService, it is a layer between repository and controller
3. CourseRepo, this layer performs DB operation.
4. CorsConfig, allowing resources sharing with FE


#### Feature

Basic CRUD operation one course

#### URL

base url <br>
http://localhost:8080


| Action             | Method | Url          |
|--------------------|--------|--------------|
| Home Page          | GET    | /            |
| View All Course    | GET    | /course      |
| Add Course         | POST   | /course      |
| View Single Course | GET    | /course/{id} |
| Update Course      | PUT    | /course/{id} |
| Delete Course      | DELETE | /Course/{id} |

## Views

#### Entity
**Course**

```json
{
  "id": 1,
  "name": "Java",
  "description": "Java is a beautiful language and has wide range of uses"
}
```

## Resources

- [SpringBoot Project Structure](https://start.spring.io/)
- [Maven Repository](https://mvnrepository.com/artifact/org.springframework)
- [JDK-11](https://www.oracle.com/in/java/technologies/javase/jdk11-archive-downloads.html)



## Running the application locally

There are several ways to run a Spring Boot application on your local machine. 
- One way is to execute the `main` method in the `src.com.course.springrest.SpringrestApplication` 
class from your IDE.


- Or you can use the command given below while in the target project:
```shell
mvn spring-boot:run
```

