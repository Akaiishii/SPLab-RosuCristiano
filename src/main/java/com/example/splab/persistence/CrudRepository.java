package com.example.splab.persistence;

import com.example.splab.models.Book;

import java.util.List;
import java.util.Optional;

public interface CrudRepository<T, TId> {
    List<T> findAll();
    T findById(TId id);
    T save(T other);
    void deleteById(TId id);
    public T update(Long id, T updatingBook);
}