# CrudREST

This repository contains a Spring Boot application implementing basic CRUD operations for a simple e-commerce system. The application includes RESTful APIs for managing categories and products, with a focus on server-side pagination and relationships between entities. The project follows modern best practices using annotation-based configuration and integrates JPA and Hibernate for database interactions.

## Features
1. Spring Boot: Framework for building the application.
2. RESTful APIs: Implemented using Spring RestController.
3. Relational Database Configuration: Configured to use an RDBMS instead of in-memory databases.
4. Annotation-Based Configuration: Avoiding XML configurations.
5. JPA & Hibernate: For ORM and database interactions.
6. CRUD Operations:
   - Categories:
      1. GET all categories with pagination.
      2. POST to create a new category.
      3. GET category by ID.
      4. PUT to update category by ID.
      5. DELETE category by ID.
   - Products: 
      1. GET all products with pagination.
      2. POST to create a new product.
      3. GET product by ID with respective category details.
      4. PUT to update product by ID.
      5. DELETE product by ID.
7. One-to-Many Relationship: Between categories and products.
8. Server-Side Pagination: Implemented for both categories and products.

## API Endpoints
 - Categories
   - GET /api/categories?page={page} - Retrieve all categories with pagination.
   - POST /api/categories - Create a new category.
   - GET /api/categories/{id} - Retrieve a category by ID.
   - PUT /api/categories/{id} - Update a category by ID.
   - DELETE /api/categories/{id} - Delete a category by ID.

 - Products
   - GET /api/products?page={page} - Retrieve all products with pagination.
   - POST /api/products - Create a new product.
   - GET /api/products/{id} - Retrieve a product by ID, including category details.
   - PUT /api/products/{id} - Update a product by ID.
   - DELETE /api/products/{id} - Delete a product by ID.

## Getting Started
  - Prerequisites
    - STS or IntelliJ IDEAz
    - Java 17 or higher
    - Maven
    - A relational database (e.g., MySQL)

## Installation

  1. Clone the repository:

```bash
git clone https://github.com/incredibledhanu123/CrudREST.git
```
 2. Configure the database:
    Update the application.properties file with your database configuration.
 3. Build and run the application:

    1. Import Project:
       - Go to File -> Import...
       - Select Maven -> Existing Maven Projects
       - Click Next

    2. Select Project Directory:
       - Click Browse...
       - Navigate to the directory containing your Maven project (the directory with the pom.xml file)
       - Click Open
       - Ensure that your project is listed under Projects
       - Click Finish
    3. Build the Maven Project

       Build Project:

       - Open the pom.xml file
       - Click on the Lifecycle tab at the bottom
       - Select clean install (this will clean and build your project, downloading necessary dependencies)
    4. Run the Spring Boot Application
       Run As Spring Boot Application:
       - Right-click on your project in the Project Explorer
       - Select Run As -> Spring Boot App
 4. Access the REST Endpoints and test using Postman tool

