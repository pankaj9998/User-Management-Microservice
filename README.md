User Management Microservice
Objective:
Develop a User Management REST API using Spring Boot that includes:
- User registration and login
- JWT-based authentication
- Role-based authorization
- Global exception handling
Requirements:
You need to build one microservice with the following features:
1. User Registration & Login
 - POST /register - Register a new user
 - POST /login - Login with email & password and get JWT token
2. JWT Authentication
 - Generate a JWT token on successful login
 - Validate the token on secured APIs
3. User Roles
 - Define roles: ROLE_USER, ROLE_ADMIN
 - Assign role during registration (default ROLE_USER)
4. User APIs (Secured with JWT)
 - GET /users - Accessible only by ADMIN
 - GET /users/{id} - Accessible by USER or ADMIN
 - DELETE /users/{id} - Only ADMIN can delete
5. Spring Security
 - Secure APIs using JWT and roles
6. Global Exception Handling
 - Use @ControllerAdvice to handle common errors
Sample Flow:
1. Register a new user via /register
2. Login with /login -> receive JWT token
3. Use JWT token in Authorization header to call secured endpoints
4. Access control should differ for USER and ADMIN
Tech Stack:
- Java 8+
- Spring Boot
- Spring Security
- JWT (jjwt or other)
- In-memory DB (H2) or MySQL
- Maven or Gradle
