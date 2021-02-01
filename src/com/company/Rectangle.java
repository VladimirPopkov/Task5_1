package com.company;

public class Rectangle extends Figure {

    private int width;
    private int height;

    @Override
    double square() {
        return width * height;
    }
}
