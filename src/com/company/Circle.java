package com.company;

public class Circle extends Figure {

    private int radius;

    @Override
    double square() {
        return 3.14 * radius * radius;
    }
}
