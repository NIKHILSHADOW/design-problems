package com.example.pen;

import lombok.Getter;

@Getter
public abstract class Pen {
    private String name;
    private String brand;
    private PenType pentype;
    private WritingStrategy writingStrategy;

    public Pen(String name, String brand, PenType penType, WritingStrategy writingStrategy) {
        this.name = name;
        this.brand = brand;
        this.pentype = penType;
        this.writingStrategy = writingStrategy;
    }

    public abstract void write();
}
