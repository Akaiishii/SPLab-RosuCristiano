package com.example.splab.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.splab.models.Author;
import com.example.splab.models.Book;

public interface AuthorsRepository extends JpaRepository<Author, Integer> {
}