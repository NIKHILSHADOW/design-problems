package com.example.pen.pentypes;

import com.example.pen.Pen;
import com.example.pen.PenType;
import com.example.pen.Refill;

import lombok.Getter;

@Getter

public class BallPointPen extends Pen {

    private Refill refill;

    public BallPointPen(Refill refill, String name, String brand) {
        super(name, brand, PenType.BALLPOINTPEN);
        this.refill = refill;
    }

    @Override
    public void write() {
        System.out.println("smooth writing strategy");
    }

}
