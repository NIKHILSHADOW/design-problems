package com.example.pen.pentypes;

import com.example.pen.Pen;
import com.example.pen.PenType;
import com.example.pen.Refill;
import com.example.pen.WritingStrategy;

import lombok.Getter;

@Getter
public class GelPen extends Pen {
    private Refill refill;

    public GelPen(Refill refill, String name, String brand, WritingStrategy writingStrategy) {
        super(name, brand, PenType.GELPEN, writingStrategy);
        this.refill = refill;
    }

    @Override
    public void write() {
        this.getWritingStrategy().write();
    }

}
