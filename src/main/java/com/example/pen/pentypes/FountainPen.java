package com.example.pen.pentypes;

import com.example.pen.Ink;
import com.example.pen.Nib;
import com.example.pen.Pen;
import com.example.pen.PenType;

import lombok.Getter;

@Getter
public class FountainPen extends Pen {

    private Ink ink;
    private Nib nib;

    public FountainPen(Ink ink, Nib nib, String name, String brand) {
        super(name, brand, PenType.FOUNTAINPEN);
        this.ink = ink;
        this.nib = nib;
    }

    @Override
    public void write() {
        System.out.println("write smoothly");
    }
}
