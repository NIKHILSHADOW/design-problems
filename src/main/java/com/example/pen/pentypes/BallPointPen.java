package com.example.pen.pentypes;

import com.example.pen.Pen;
import com.example.pen.Refill;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BallPointPen extends Pen {

    private Refill refill;

    @Override
    public void write() {
        System.out.println("smooth writing strategy");
    }

}
