package com.example.pen;

import lombok.Getter;

@Getter
public abstract class Pen {
    private String name;
    private String brand;
    private PenType pentype;

    public Pen(String name, String brand, PenType penType) {
        this.name = name;
        this.brand = brand;
        this.pentype = penType;
    }

    public abstract void write();
}
