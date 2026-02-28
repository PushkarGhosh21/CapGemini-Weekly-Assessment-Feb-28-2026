
## Repository Contents

The project is divided into two main modules:

### 1. Core Java OOP Assessment (`oopsAssessment`)
A console-based food ordering system demonstrating core OOP concepts (Abstraction, Inheritance, Polymorphism, and Encapsulation).
* **`Main.java`**: Contains the abstract `FoodItem` class, its subclasses (`VegItem`, `NonVegItem`), the `Order` processing class, and the main execution method to calculate a total bill with category-specific discounts.

### 2. Hibernate Assessment (`com.hibernateassessment`)
A Java application demonstrating basic CRUD (Create, Read, Update, Delete) operations on an `Employee` entity using Hibernate and a MySQL database.
* **`Employee.java`**: The JPA annotated entity class mapping to the `Emp` table in the database.
* **`Launch.java`**: The main execution class containing the Hibernate session management and CRUD operations.
* **`hibernate.cfg.xml`**: The Hibernate configuration file containing database connection details and dialect settings.
* **`pom.xml`**: The Maven configuration file managing dependencies for `mysql-connector-j` (8.3.0) and `hibernate-core` (8.0.0.Alpha1).
