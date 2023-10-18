package com.example.splab;
import java.util.ArrayList;

public class Chapter {
    private String name;
    private ArrayList<SubChapter> subchapters;

    public Chapter(String name) {
        this.name = name;
        this.subchapters=new ArrayList<>();
    }

    public void addSubchapter(SubChapter subchapter) {
        subchapters.add(subchapter);
    }

    public int createSubChapter(String name){
        SubChapter subChapter=new SubChapter(name);
        subchapters.add(subChapter);
        return subchapters.indexOf(subChapter);
    }

    public SubChapter getSubChapter(int index){
        return subchapters.get(index);
    }
    public void print() {
        System.out.println("Chapter: " + name);
        System.out.println("Subchapters:");
        for (SubChapter subchapter : subchapters) {
            subchapter.print();
        }
    }
}