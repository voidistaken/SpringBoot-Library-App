package com.example.secondproject;

import com.example.secondproject.entities.Author;
import com.example.secondproject.entities.Book;
import com.example.secondproject.entities.Category;
import com.example.secondproject.repositories.AuthorRepo;
import com.example.secondproject.repositories.BookRepo;
import com.example.secondproject.repositories.CategoryRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class SecondprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecondprojectApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(AuthorRepo authorRepo, BookRepo bookRepo, CategoryRepo categoryRepo) {
        return args -> {
            Author author1 = Author.builder()
                    .name("Franz Kafka")
                    .nation("Sweden") // Corrected spelling
                    .build();

            Category category1 = Category.builder()
                    .name("Roman")
                    .build();
            categoryRepo.save(category1);

            Book book1 = Book.builder()
                    .title("Letters to Milena")
                    .price(180)
                    .date(LocalDate.of(1862, 6, 8))
                    .author(author1)
                    .category(category1)
                    .build();

            Book book2 = Book.builder()
                    .title("Metamorphosis")
                    .price(120)
                    .date(LocalDate.of(1862, 2, 4))
                    .author(author1)
                    .category(category1)
                    .build();

            // Add books to author
            author1.getBooks().addAll(List.of(book1, book2));

            // Save author and books
            authorRepo.save(author1);
            bookRepo.saveAll(List.of(book1, book2));
        };
    }
}
