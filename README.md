# **API-Demo: Student Management System**

## Description
This is a Spring Boot REST API project designed to manage student data. It includes basic CRUD (Create, Read, Update, Delete) operations and interacts with a MySQL database. 

## Features
* Add single or multiple students to the database.
* Retrieve all students or search for specific students by ID or name.
* Update student details.
* Delete a student by ID.

## Technologies Used
* Spring Boot 3.4.0 for building the REST API.
* Java 17 for programming.
* Spring Data JPA for database interactions.
* MySQL as the database.
* Lombok for reducing boilerplate code.
* Postman for testing the REST API.

## Project Overview
### Controller
   The StudentController class maps HTTP requests to appropriate service methods.
   Key endpoints:

* Add Student: /addStudent (POST)
* Add Multiple Students: /addStudents (POST)
* Get All Students: /students (GET)
* Find Student by ID: /studentById/{id} (GET)
* Find Student by Name: /studentByName/{name} (GET)
* Update Student: /update (PUT)
* Delete Student: /delete/{id} (DELETE)

### Service
   The StudentService class contains business logic for managing students.
   Key methods:

* saveStudent and saveStudents for saving students.
* getStudents, getStudentById, and getStudentByName for retrieval.
* updateStudent for updating a student.
* deleteStudent for removing a student by ID.

### Repository
   The StudentRepository interface extends JpaRepository to provide methods for interacting with the database.
   Key functionality:

findByName(String name) to search for a student by name.
Default methods like save, findById, and deleteById.

### Entity
   The Student class maps to the Student_TBL table in the database. It includes:

id (Primary Key)
name (String)
gender (String)
Annotations like @Entity, @Table, and @Id are used for database mapping, and Lombok reduces boilerplate code using @Data, @NoArgsConstructor, and @AllArgsConstructor.

## Example Usage
### Add a Single Student
   Send a POST request to /addStudent with the following JSON body:

`{
"name": "John Doe",
"gender": "Male"
}`

### Add Multiple Students
   Save the following JSON in a file (e.g., students.json) and use it in a POST request to /addStudents:

`[
{
"name": "AAA",
"gender": "Male"
},
{
"name": "BBB",
"gender": "Female"
}
]`

### Retrieve All Students
   Send a GET request to /students.

### Find a Student by ID
   Send a GET request to /studentById/{id} (replace {id} with the desired student's ID).

### Update a Student
   Send a PUT request to /update with updated student details:

`{
"id": 1,
"name": "Jane Doe",
"gender": "Male"
}`

### Delete a Student
   Send a DELETE request to /delete/{id} (replace {id} with the student's ID).

## Dependencies
All dependencies are managed in pom.xml. Key dependencies include:

* spring-boot-starter-web
* spring-boot-starter-data-jpa
* mysql-connector-j
* lombok

## Prerequisites
* Java 17
* Maven
* MySQL Server