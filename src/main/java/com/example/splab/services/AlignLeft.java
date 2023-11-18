package com.example.splab.services;

public class AlignLeft implements AlignStrategy {
    @Override
    public void render(String text) {
        System.out.println("Paragraph: "  + text + "#");
    }
}