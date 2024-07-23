package com.example.pen;

import lombok.Getter;

@Getter
public abstract class Pen {
    private String name;
    private String brand;
    private PenType pentype;

    public abstract void write();
}
