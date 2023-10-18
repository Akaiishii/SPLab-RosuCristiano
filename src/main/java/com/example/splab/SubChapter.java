package com.example.splab;

import java.util.ArrayList;

public class SubChapter {
    private String name;
    private ArrayList<Element> elements;

    public SubChapter(String name) {
        this.name = name;
        this.elements=new ArrayList<>();
    }

    public void createNewParagraph(String name){
        Paragraph paragraph=new Paragraph(name);
        elements.add(paragraph);
    }

    public void createNewImage(String name){
        Image image=new Image(name);
        elements.add(image);
    }

    public void createNewTable(String name){
        Table table=new Table(name);
        elements.add(table);
    }

    public void print() {
        System.out.println("Subchapter: " + name);
        System.out.print("Elements within Subchapter: ");
        for (Element element : elements) {
            element.print();
        }
    }
}