package com.example.splab.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.splab.models.Book;

@Repository
public interface BookJpaRepository extends JpaRepository<Book, Long> {
}