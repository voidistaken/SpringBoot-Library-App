Spring Boot Project - Book Management System

📌 Overview

This is a Spring Boot application that manages books, authors, and categories. The application uses Spring Data JPA to interact with a MySQL database and allows users to store and retrieve book information efficiently.

🚀 Features

CRUD Operations for Books, Authors, and Categories.

Hibernate & JPA for database interaction.

Lombok for reduced boilerplate code.

Spring Boot CommandLineRunner to populate initial data.

🛠️ Technologies Used

Java 17+

Spring Boot 3+

Spring Data JPA

MySQL Database

Lombok

Maven

🏗️ Project Structure

📥 Installation & Setup

1️⃣ Clone the repository

2️⃣ Configure the Database

Update src/main/resources/application.properties with your MySQL credentials:

3️⃣ Install Dependencies

Run the following command to install dependencies:

4️⃣ Run the Application

📌 API Endpoints (Example)

Method

Endpoint

Description

GET

/books

Get all books

POST

/books

Add a new book

GET

/authors

Get all authors

POST

/authors

Add a new author

GET

/categories

Get all categories

POST

/categories

Add a new category

📜 License

This project is open-source and available under the MIT License.
