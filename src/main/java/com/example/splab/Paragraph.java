package com.example.splab;

public class Paragraph implements Element{
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println("Text: " + text);
    }
}