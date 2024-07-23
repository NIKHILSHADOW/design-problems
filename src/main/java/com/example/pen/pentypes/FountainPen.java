package com.example.pen.pentypes;

import com.example.pen.Ink;
import com.example.pen.Nib;
import com.example.pen.Pen;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class FountainPen extends Pen {

    private Ink ink;
    private Nib nib;

    @Override
    public void write() {
        System.out.println("write smoothly");
    }
}
