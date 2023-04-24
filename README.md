# Spring boot, Hibernate, MySQL, REST API
A simple Spring boot application that demonstrates the usage of RESTful API using Spring boot, Hibernate and MySQL.


# Tools and Technologies Used:
- Java 1.8
- Spring Boot 2.7.10
- MySQL
- JPA
- Hibernate
- Maven
- Visual Studio Code


# Creation of Database and Table:
- Creation of CRUDAPI Database:  

![Database](https://user-images.githubusercontent.com/75598310/233898641-77220310-19be-4c31-a5e6-1e4cae7aac81.jpg)
- Creation of Employee Table:

![Employee Table](https://user-images.githubusercontent.com/75598310/233898708-f284d2b2-2f31-43a4-9035-061ff146ff1c.jpg)
- Key-Value pairs defined in application.properties:
![Application Properties](https://user-images.githubusercontent.com/75598310/233898843-c6199226-06b9-425d-b41b-add5c589e2b8.jpg)

The properties defined above means:
- **spring.datasource.url**: The URL to connect to the database, in this case a MySQL database running on localhost on port 3306, with the name "crudapi".
- **spring.datasource.username**: The username to use to connect to the database.
- **spring.datasource.password**: The password to use to connect to the database.
- **spring.jpa.database-platform**: The dialect of the SQL database that Hibernate will use to generate SQL queries. In this case, the MySQL 8 dialect is used.
- **spring.jpa.hibernate.ddl-auto**: This property specifies how Hibernate will update the schema of the database when the application starts up. "Update" means that Hibernate will create or modify the necessary database tables, indexes, and constraints based on the entity classes in the application.
- **spring.jpa.show-sql**: This property specifies whether or not Hibernate will output the SQL statements it generates to the console. If set to true, Hibernate will log all the SQL statements to the console, which can be helpful for debugging purposes.


# REST APIs used:
The application uses the following APIs:
- **GET /api/employee** - List all the employees present in the Employee table.
- **GET /api/emploee/{id}** - List the employee present in the Employee table according to their ID.
- **POST /api/employee** - Create a record of an employee to be saved in the Employee table. 
- **PUT /api/employee** - Update the employee information.
- **DELETE /api/employee/{id}** - Deletes the record of an employee from the Employee table using their ID.
