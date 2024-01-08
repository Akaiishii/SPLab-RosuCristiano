package com.example.splab.services;

import com.example.splab.models.Book;

import java.io.IOException;

public interface Observer {
    void update(Book book) throws IOException;
}