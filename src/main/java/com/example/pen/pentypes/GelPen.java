package com.example.pen.pentypes;

import com.example.pen.Pen;
import com.example.pen.PenType;
import com.example.pen.Refill;

import lombok.Getter;

@Getter
public class GelPen extends Pen {
    private Refill refill;

    public GelPen(Refill refill, String name, String brand) {
        super(name, brand, PenType.GELPEN);
        this.refill = refill;
    }

    @Override
    public void write() {
        System.out.println("write hardly");
    }

}
