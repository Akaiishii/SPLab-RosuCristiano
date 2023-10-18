package com.example.splab;

public class Image implements Element{
    private String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
    }

    public void print() {
        System.out.println("Image: " + imageName);
    }
}