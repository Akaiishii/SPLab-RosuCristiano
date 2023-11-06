package com.example.splab;

public class AlignCenter implements AlignStrategy{
    @Override
    public void render(String text) {
        System.out.println(  "#" + text + "#");
    }
}
