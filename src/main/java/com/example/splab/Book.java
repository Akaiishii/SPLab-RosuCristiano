package com.example.splab;

import java.util.ArrayList;

public class Book {
    private String title;
    private ArrayList<Chapter> chapters;
    private ArrayList<Author> authors;


    public Book(String title) {
        this.title = title;
        this.authors = new ArrayList<>();
        this.chapters = new ArrayList<>();
    }


    public void addChapter(String chapterTitle) {
        Chapter chapter = new Chapter(chapterTitle);
        chapters.add(chapter);
    }

    public int createChapter(String chapterTitle) {
        Chapter chapter = new Chapter(chapterTitle);
        chapters.add(chapter);
        return chapters.indexOf(chapter);
    }

    public Chapter getChapter(int indexChapterOne){
        return chapters.get(indexChapterOne);
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void print() {
        System.out.println("Title: " + title);
        System.out.println("Authors:");
        for (Author author : authors) {
            author.print();
        }
        System.out.println("Chapters:");
        for (Chapter chapter : chapters) {
            chapter.print();
        }
    }

}