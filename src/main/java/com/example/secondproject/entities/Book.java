package com.example.secondproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class Book {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Integer price;
    private LocalDate date;
    @ManyToOne
    @JoinColumn(name="author_id")
    @JsonIgnore
    private Author author;
    @ManyToOne
    @JoinColumn(name="category_id")
    @JsonIgnore
    private Category category;
}
