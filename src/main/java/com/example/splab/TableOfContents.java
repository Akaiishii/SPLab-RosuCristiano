package com.example.splab;

import java.util.ArrayList;

public class TableOfContents {
    private ArrayList<String> chapters;
    private Book book;

    public void addChapter(String chapterTitle) {
        chapters.add(chapterTitle);
    }

    public void print() {
        System.out.println("Table of Contents for " + ":"); // + book.getTitle() + ":");
        for (int i = 0; i < chapters.size(); i++) {
            System.out.println("Chapter " + (i + 1) + ": " + chapters.get(i));
        }
    }
}