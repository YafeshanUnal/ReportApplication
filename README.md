# ReportApplication

# Spring-Boot-Product-System

 Spring Boot Crud Application with Thymeleaf, JPA, Spring Security. 
 
# Product System

This project based on the Spring Boot project and used packages:

<ul>
<li>Spring Boot</li>
<li>Spring Data</li>
 <li>Spring Security</li>
<li>Thymeleaf</li>
<li>JavaScript</li>
 <li>Bootstrap</li>
<li>Maven</li>
</ul>

## Installation

### 1. Clone the application

<pre> $ git clone https://github.com/YafeshanUnal/ReportApplication.git </pre>

### 2. Database Configuration

MySQL is used as the database.
<ul>
<li> Open src/main/resources/application.properties </li>
<li> If you run the application locally, change spring.datasource.username and spring.datasource.password as per your mysql installation</li>
</ul>
The project is created with Maven.

### 3. Launch

<pre>mvn clean package</pre>

or to run the application locally:

<pre>mvn clean install</pre>

<pre>mvn spring-boot:run</pre>

commands run the application.

Application runs from localhost:8080/

There are users of type user and admin.

User Credential: 
<pre>username: user  password: root</pre>

Admin Credential: 
<pre>username root  password: root</pre>

İf you try as user, you will get access denied on delete product page. You have to try as admin.

The application runs from http://localhost:8080/

## Why Used This Technologies

**Sprint Boot:** The Spring library is one of the most well-known libraries in the Java world and you can easily find a lot of information about it. That's why I chose Spring for my project.

**Maven:** Project requires maven to run without IDE configurations.

**Spring Security:** Spring Security is essential for the login-registration system. I can manage which roles can access which pages. Using Spring Security is very simple and it is the main security library for Spring.

**Thymeleaf:** I didn't know Thymeleaf exactly, I had react and plain html in mind, but Thymeleaf made my job much easier compared to others, I saved time.

**Bootstrap:** An easy to use and fast library in the current Css world, I have used it in this project as I have worked on it before.


## Screenshots

![screen shot 2018-07-11 at 09 19 15](https://github.com/YafeshanUnal/ReportApplication/blob/master/src/login.png)
<br/>

![screen shot 2018-07-18 at 17 41 58](https://github.com/YafeshanUnal/ReportApplication/blob/master/src/Ekran%20g%C3%B6r%C3%BCnt%C3%BCs%C3%BC%202022-05-08%20211929.png)
<br>


![screen shot 2018-07-11 at 09 18 59](https://github.com/YafeshanUnal/ReportApplication/blob/master/src/update.png)
<br/><br/>

