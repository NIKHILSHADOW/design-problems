package com.example.pen.pentypes;

import com.example.pen.Pen;
import com.example.pen.Refill;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GelPen extends Pen {
    private Refill refill;

    @Override
    public void write() {
        System.out.println("write hardly");
    }

}
