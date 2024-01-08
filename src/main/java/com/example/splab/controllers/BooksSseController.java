package com.example.splab.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;
import com.example.splab.services.AllBooksSubject;
import com.example.splab.services.Observer;
import com.example.splab.services.SseObserver;

@RestController
public class BooksSseController {


    private final AllBooksSubject allBooksSubject;

    public BooksSseController(AllBooksSubject allBooksSubject) {
        this.allBooksSubject = allBooksSubject;
    }

    @RequestMapping("/books-sse")
    public ResponseBodyEmitter getBooksSse() {
        final SseEmitter emitter = new SseEmitter(0L);
        Observer observer = new SseObserver(emitter);
        allBooksSubject.attach(observer);
        return emitter;
    }
}