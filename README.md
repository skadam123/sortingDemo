# Sorting Demo Application
Sorting Demo Application in Spring Boot

# Prequisite

1. Java 8.
2. Maven 3.0 or above. 

# Steps To Run

1. Build the project using following command, the command must be issued from source folder.

   mvn clean package

2. Start the project using
   
   mvn spring-boot:run
   
Since its spring boot application, we don't need seprate container like Tomcat/Jboss to run the application. The build will automatically generate sort-rest-service-0.1.0.jar which is fat jar contains all dependencies along with embedded Tomcat server.
   
3. Launch application by hitting 
   
   http://localhost:8080 in your browser.

4. Build Process in #1 will run unit tests also you can skip test case execution during build using
   
   mvn clean package -Dmaven.test.skip=true
   
# Database

Since its demo app. I have used default h2 database of spring boot. Its in memory database and supports all RDBMS operations. However database would be wiped out automatically after application is terminated. We can preserve data by simply adding some properties in application.properties/application.yml. Current project doesn't have these properties defined as it still serves the purpose of demo.
Application is database agnostic we can add property file and can connect it to any database in background. application.properties file is just provided for sample application would work without it also.
We have selected h2 database because user don't have to install any database and application can run with minimum dependencies.

# Architecture
Project is implmented using Spring boot and exposes 2 REST services
1. Input Processing Service
2. Sorting Service.

However current design is monolith as UI and services are clubbed together. In ideal scenario UI could have been built as separate app and services in separate app.

Typically these services can run inside containers e.g. dockers so that they are easy to deploy without any additional setup and are easy to scale at any numbers. However docker deployment of this application is not in current scope of the project.


